package com.goomo;


interface lamdaCls {
	public void demo();
}

public class LamdaApp {
	public static void main(String[] args) {
		lamdaCls lambda = ()->{
		 System.out.println("Statement 1");
		 System.out.println("Statement 1");
		};
		lambda.demo();
	}
}
