package com.sdet.loan.step;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class GenericHooks {

	@Before
	public void beforeEachStep(){
		System.out.println("***********************************");
		System.out.println("Hey i'm there before each step ");
		System.out.println("***********************************");

	}
	@After
	public void afterEachStep(){
		System.out.println("***********************************");
		System.out.println("Hey i'm there after each step.. ");
		System.out.println("***********************************");

	}
}
