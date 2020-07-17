package com.sdet.jdbc.stds;

import java.util.List;

import com.sdet.jdbc.beans.Customer;

// this interface shall have the list of methods required 
// CRUD 
public interface ICustomerDAO {

	// insert
	public boolean insertCustomer(Customer customer);

	// update
	public boolean updateCustomerSalary(int custId, double newSalary);

	// delete
	public boolean deleteCustomer(int custId);

	// select
	public Customer getCustomer(int custId);

	// select all
	public List<Customer> getAllCustomers();
}
