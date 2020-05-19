package com.sdet.customertest;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.sdet.day11.Sample;


@RunWith(Parameterized.class)
public class ParameterizationAddNumbersTest {

	private int num1; 
	private int num2; 
	private Sample sample; 
	
	// the values for this will be injected by jUnit 
	public ParameterizationAddNumbersTest(int num1, int num2){
		this.num1 = num1; 
		this.num2 = num2; 
	}
	
	// this method will have the value injection to constructor 
	
	@Parameters
	public static List<Object[]> populateData(){
		return Arrays.asList(new Object[][]{
			// as of now it is static (hard coded) values or this can be 
			// values populated from DB, XLS etc 
			{10, 20}, 
			{20, 30},
			{30, 40},
			{40, 50},
			{50, 60}
		}); 
	}
	
	@Before
	public void setUp(){
		sample = new Sample(); 
	}
	
	@Test
	public void test() {
		int res = this.num1 + this.num2; 
		assertEquals(res, sample.addNumbers(this.num1, this.num2));
	}

}
