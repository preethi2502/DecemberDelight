package com.a.com;

public class B {

	public static void main(String[] args) {

		A a = new A();

		a.setId(50);
		a.setPhoneno("3526556");

		String phoneno = a.getPhoneno();
		System.out.println(phoneno);

		int id = a.getId();
		System.out.println(id);

	}

}
