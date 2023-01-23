package org.ssglobal.training.codes.itemA;

public sealed class WholesaleCake extends Cake permits OrderedWholesaleCake, CustomWholesaleCake{
	protected double[] cake = new double[0];
	protected double[] discount = new double[0];

	@Override
	public double calcPrice() {
		if (cake.length  >= 5) {
			double totalPrice = 0;
			
			for (int i = 0; i < cake.length; i++) {
				totalPrice =  rate * cake[i];
			}
			return totalPrice;
		}
		return 0;
	}
	
	public double calcDiscount() {
		double disc = 0;
		
		if (discount.length > 0) {
			for (int i = 0; i < discount.length; i++) {
				disc += calcPrice() * discount[i];
			}
		}
		return calcPrice() - disc;
	}

}
