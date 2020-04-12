 package com.goomo;

interface Lambda {
	public void demo();
}

public class Application {
	public static void main(String[] args) {
		Lambda lambda = new Lambda() {

			@Override
			public void demo() {
              System.out.println("Statement 1 ");
              System.out.println("Statement 2 ");
			}
		};
		lambda.demo();
	}
}
