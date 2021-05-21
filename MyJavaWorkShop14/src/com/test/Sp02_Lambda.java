package com.test;

interface ICalculator{
	public int add(int x, int y);
}



public class Sp02_Lambda {
	public static void main(String[] args) {
		ICalculator calc = new ICalculator() {
			public int add(int a, int b) {
				return a + b;
			}
		};
		int c = calc.add(30, 50);
		System.out.println(c);
		
		ICalculator calc2 = (x, y) -> {
			return x + y;
		};
		int f = calc2.add(30,  100);
		System.out.println(f);
		
	}
}
