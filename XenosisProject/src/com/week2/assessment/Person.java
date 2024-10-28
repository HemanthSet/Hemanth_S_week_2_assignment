package com.week2.assessment;

public class Person {

	String Name;
	int age;

	public void per(String a, int b) {

		String Name = a;
		int age = b;

		System.out.println(Name);
		System.out.println(age);

	}

	public static void main(String[] args) {

		Person obj = new Person();
		obj.per("Hemanth", 20);

	}
}
