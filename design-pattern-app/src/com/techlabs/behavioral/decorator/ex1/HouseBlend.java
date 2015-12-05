package com.techlabs.behavioral.decorator.ex1;

public class HouseBlend extends Beverage {
	public HouseBlend() {
		description = "House blend coffee";
	}

	@Override
	public double cost() {
		return 0.89;
	}

}
