package com.sdet.jdbc.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sdet.jdbc.beans.Customer;
import com.sdet.jdbc.connection.GetConnection;
import com.sdet.jdbc.stds.ICustomerDAO;

public class CustomerDAO implements ICustomerDAO{

	// Array Index start from 0 (zero) 
	// Iterators start from -1 
	// positional parameters starts from 1 
	
	@Override
	public boolean insertCustomer(Customer customer) {
		String sql="insert into customer values(?,?,?,?)";
		
		try {
			GetConnection gc = new GetConnection(); 
			gc.ps = GetConnection.getMySQLConnection().prepareStatement(sql); 
			
			gc.ps.setInt(1, customer.getCustId());
			gc.ps.setString(2, customer.getCustName());
			gc.ps.setString(3, customer.getCustEmail());
			gc.ps.setDouble(4, customer.getCustSalary());
			
			return gc.ps.executeUpdate()>0; 
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
		
	}

	@Override
	public boolean updateCustomerSalary(int custId, double newSalary) {
		
		String sql ="update customer set custincome = ? where custid = ?";
		
		GetConnection gc = new GetConnection(); 
		
		try {
			gc.ps = GetConnection.getMySQLConnection().prepareStatement(sql); 
			gc.ps.setDouble(1, newSalary);
			gc.ps.setInt(2, custId);
			
			return gc.ps.executeUpdate()>0;
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		return false;
	}

	// Assignment 
	@Override
	public boolean deleteCustomer(int custId) {
		return false;
	}

	@Override
	public Customer getCustomer(int custId) {

		String sql = "select custid,custname,custemail,"
				+ "custincome from customer where custid=?"; 
		
		GetConnection gc = new GetConnection(); 
		try {
			gc.ps = GetConnection.getMySQLConnection().prepareStatement(sql); 
			gc.ps.setInt(1, custId);


			// rs -> result set will hold the value which is given from DB 
			// and start the iteration from -1 
			gc.rs = gc.ps.executeQuery();
			
			// ResultSets are always read only (there are some exceptional cases) 
			if(gc.rs.next()){
				Customer customer = new Customer(); 
				
				customer.setCustId(gc.rs.getInt(1));
				customer.setCustName(gc.rs.getString(2));
				customer.setCustEmail(gc.rs.getString(3));
				customer.setCustSalary(gc.rs.getDouble(4));
				
				return customer; 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		

		return null;
	}

	@Override
	public List<Customer> getAllCustomers() {

		List<Customer> customerList = new ArrayList<Customer>(); 
		String sql="select custid,custname,custemail,custincome from customer";
		GetConnection gc = new GetConnection(); 
		
		try {
			gc.ps = GetConnection.getMySQLConnection().prepareStatement(sql); 
			
			gc.rs = gc.ps.executeQuery(); 
			
			// there may be more than 1 record 
			while(gc.rs.next()){
				Customer customer = new Customer(); 
				
				customer.setCustId(gc.rs.getInt(1));
				customer.setCustName(gc.rs.getString(2));
				customer.setCustEmail(gc.rs.getString(3));
				customer.setCustSalary(gc.rs.getDouble(4));
				
				customerList.add(customer); 
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return customerList;
	}

}


















