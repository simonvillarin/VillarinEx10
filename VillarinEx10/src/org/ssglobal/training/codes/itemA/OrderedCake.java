package org.ssglobal.training.codes.itemA;

public final class OrderedCake extends Cake {
	protected double weight;
	protected double discount;
	
	@Override
	public double calcPrice() {
		return rate * weight;
	}
	
	public double calcDiscount() {
		return calcPrice() - (calcPrice() * discount);
	}

}
