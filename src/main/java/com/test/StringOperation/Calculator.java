package com.test.StringOperation;
// basic calculator for 4 functions using a constructor concepts
public class Calculator {

	public int Add(int a , int b) {
		int c ;
		c = a+b;
		return c;
	}
	public int sub(int a , int b) {
		int c ;
		c = a-b;
		return c;
	}
	public int div(int a , int b) {
		int c ;
		c = a/b;
		return c;
	}
	public int multiply(int a , int b) {
		int c ;
		c = a*b;
		return c;
	}
	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println("the addition :" +c.Add(2, 4));
		System.out.println("the subtraction :" +c.sub(2, 4));
		System.out.println("the multiplication :" +c.multiply(2, 4));
		System.out.println("the division :" +c.div(4, 2));

	}

}
