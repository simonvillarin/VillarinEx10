package org.ssglobal.training.codes.itemA;

public non-sealed class ReadyMadeCake extends Cake {
	protected int quantity;
	
	@Override
	public double calcPrice() {
		return rate * quantity;
	}
	
	public double calcDiscount() {
		return calcPrice() - (0.10 * calcPrice());
	}

}
