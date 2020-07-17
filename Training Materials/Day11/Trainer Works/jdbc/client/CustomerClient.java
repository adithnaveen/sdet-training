package com.sdet.jdbc.client;

import java.util.List;

import com.sdet.jdbc.beans.Customer;
import com.sdet.jdbc.dao.CustomerDAO;
import com.sdet.jdbc.stds.ICustomerDAO;

public class CustomerClient {
	public static void main(String[] args) {
		Customer customer = new Customer(); 
		ICustomerDAO customerDAO = new CustomerDAO(); 
		
/*		customer.setCustId(103);
		customer.setCustName("Ashwini");
		customer.setCustEmail("Ashwini@gmail.com");
		customer.setCustSalary(8100);
		
		
		boolean flag = customerDAO.insertCustomer(customer); 
		System.out.println(flag?"Record inserted":"Sorry Not Inserted");*/
		
		
/*		System.out.println(
				customerDAO.updateCustomerSalary(102, 9800)?
						"Record Updated Successfully":
							"Sorry Not Updated"); */
		
		
	// 	Customer retCustomer = customerDAO.getCustomer(104); 
		
		List<Customer> list = customerDAO.getAllCustomers(); 
		
		for(Customer retCustomer : list){
			System.out.println("---------------------------------------------------");
			System.out.println("Customer id " + retCustomer.getCustId());
			System.out.println("Customer Name " + retCustomer.getCustName());
			System.out.println("Customer Email " + retCustomer.getCustEmail());
			System.out.println("Customer Salary " + retCustomer.getCustSalary());
		}
		
		
		
	}
}
