package com.pack.lombokdemo;

import lombok.NonNull;

public class App {
	public static void main(String args[]) {
		//Emp e1= new Emp();
		//e1.setName("Aditi");
		Emp e1= new Emp("Aditi",21,212,"Hi");
		//Emp e2= new Emp("Aditi",21,212,"Hi");
		//e1.setAge(22);
		//e1.setSalary(23423);
		//e1.setDesignation("student");
		e1= null;
		App.display(e1);
		
		//System.out.println(e1);
		//System.out.println(e1.equals(e2));
	}
	
	public static void display(@NonNull Emp e) {
		System.out.println("Details:");
		System.out.println(e);
	}
}
