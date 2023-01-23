package org.ssglobal.training.codes.itemA;

public class TestCake {

	public static void main(String[] args) {
		OrderedCake oc = new OrderedCake();
		oc.rate = 30;
		oc.weight = 50;
		oc.discount = 0.10;
		System.out.println("Total Price: %.2f".formatted(oc.calcPrice()));
		System.out.println("Discounted Price: %.2f".formatted(oc.calcDiscount()));
		
		ReadyMadeCake rmc = new ReadyMadeCake();
		rmc.rate = 30;
		rmc.quantity = 20;
		System.out.println("Total Price: %.2f".formatted(rmc.calcPrice()));
		System.out.println("Discounted Price: %.2f".formatted(rmc.calcDiscount()));
		
		WholesaleCake wsc = new WholesaleCake();
		wsc.rate = 30;
		
		double[] cake = {200, 300, 400, 500, 600};
		wsc.cake = cake;
		System.out.println("Total Price: %.2f".formatted(wsc.calcPrice()));
		
		double[] discount = {0.10, 0.20, 0.30, 0.10, 0.10};
		wsc.discount = discount;
		System.out.println("Discounted Price: %.2f".formatted(wsc.calcDiscount()));
	}

}
