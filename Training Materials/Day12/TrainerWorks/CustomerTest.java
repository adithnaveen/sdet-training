package com.sdet.customertest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.sdet.jdbc.beans.Customer;
import com.sdet.jdbc.dao.CustomerDAO;
import com.sdet.jdbc.stds.ICustomerDAO;

public class CustomerTest {

	ICustomerDAO customerDao; 
	Customer customer; 
	
	@Before
	public void setUp(){
		customerDao = new CustomerDAO();
		customer = new Customer(); 
	}
	
	@Test
	public void insertCustomerTest() {
		customer.setCustId(201);
		customer.setCustName("Naveen");
		customer.setCustEmail("naveen@probits.in");
		customer.setCustSalary(3000);
		
		boolean  flag = customerDao.insertCustomer(customer);
		assertEquals(true, flag);
	}
	
	@Ignore
	@Test
	public void deleteCustomerTest(){
		int customerId = 201; 
		boolean  flag = customerDao.deleteCustomer(customerId);
		assertEquals(true, flag);
	}

	@Test
	public void updateCustomerTest(){}
	
	@Test
	public void getCustomerTest(){}
	
	@Test
	public void getCountCustomerTest(){}
}
