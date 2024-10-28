package com.week2.assessment;

public class Addition {

	int num1;
	int num2;

	Addition(int a, int b) {
		num1 = a;
		num2 = b;
	}

	int add() {
		return num1 + num2;
	}

	int add(int c) {
		return num1 + num2 + c;
	}

	double add(double d1, double d2) {
		return d1 + d2;
	}

	public static void main(String[] args) {
		Addition obj = new Addition(50, 45);
		System.out.println("Addition of Two Numbers.");
		System.out.println(obj.add());
		System.out.println("Addition of Three Numbers.");
		System.out.println(obj.add(20));
		System.out.println("Addition of Two decimal Numbers.");
		System.out.println(obj.add(15.08, 18.05));

	}

}
