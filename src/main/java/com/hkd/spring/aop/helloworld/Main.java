package com.hkd.spring.aop.helloworld;

public class Main {

	public static void main(String[] args) {
		MathematicsCalculator target = new MathematicsCalculatorImpl();
		MathematicsCalculator proxy = new MathematicsCalculatorLoggingProxy(target).getLoggingProxy();
		
		System.out.println("--> "+proxy.add(1, 3));

	}

}
