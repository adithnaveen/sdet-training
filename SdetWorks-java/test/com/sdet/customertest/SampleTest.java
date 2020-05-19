package com.sdet.customertest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.sdet.day11.Sample;

public class SampleTest {
	
	Sample sample = null; 
	
	// this method shall get annotated 
	// by Before, then this method is invoked before any 
	// method invocation 
	@Before
	public void setUp(){
		sample = new Sample(); 
	}

	@After
	public void tearDown(){
		System.out.println("In tear down");
	}
	
	// @ class level 
	@BeforeClass
	public static void setUpBeforeAll(){
		System.out.println("Before All method invoked... ");
	}
	
	@AfterClass
	public static void tearDownAfterAll(){
		System.out.println("After All method Invoked");
	}
	
	
	@Test
	public void test() {
		assertEquals(true, sample.sayOk());
	}
	
	
	@Ignore
	@Test(timeout=1000)
	public void helloTest(){
		String name="Harry"; 
		String expected = "Hello ";
		assertEquals((expected + name)  , sample.sayHello(name));
	}

	@Test
	public void helloFailedCaseTest(){
		String name="Harry"; 
		String expected = "Hello ";
		assertNotEquals(( name)  , sample.sayHello(name));
	}
	
	
}
