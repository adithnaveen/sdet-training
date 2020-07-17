package com.sdet.day8;

import java.io.IOException;

public class SalHikeCheck {

	public static void checkHikeSal(int hikeSal, String empName) throws MyCompanyException {
		if (hikeSal > 1000) {
			System.out.println("Hey i'm okay and happy by " + empName + ", for the hike " + hikeSal);
		} else if (hikeSal > 500 && hikeSal <= 1000) {
			throw new ArithmeticException(
					"Hey I'm not all happy with this salary hike of " + hikeSal + ", by " + empName);
		} else if (hikeSal < 500) {
			throw new MyCompanyException("Sorry i'm disappointed for hike of " + hikeSal + ", by " + empName);

		}
	}

	public static void main(String[] args) {
		try {
			checkHikeSal(450, "Harry");
		} catch (MyCompanyException e) {
			e.printStackTrace();
		}

		System.out.println("Some other business logic goes here... ");
	}
}
