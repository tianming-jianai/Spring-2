package com.hkd.spring.aop.helloworld;

public class MathematicsCalculatorImpl implements MathematicsCalculator {

	@Override
	public int add(int i, int j) {
		System.out.println("计算加法了...");
		return i + j;
	}

	@Override
	public int sub(int i, int j) {

		return i - j;
	}

	@Override
	public int mul(int i, int j) {

		return i * j;
	}

	@Override
	public int div(int i, int j) {

		return i / j;
	}

}
