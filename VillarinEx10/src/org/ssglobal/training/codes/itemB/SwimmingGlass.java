package org.ssglobal.training.codes.itemB;

public non-sealed class SwimmingGlass extends SportsVisionShoppe {
	protected String style;
	
	@Override
	public double calCharges() {
		if (type == 'A') {
			if (style.equals("Retro")) {
				return 150 - (150 * 0.07);
			} else if (style.equals("Warrior")) {
				return 150 - (150 * 0.30);
			} else if (style.equals("Modern")) {
				return 150 - (150 * 0.10);
			}
		} else if (type == 'S') {
			if (style.equals("Retro")) {
				return 250 - (250 * 0.05);
			} else if (style.equals("Warrior")) {
				return 250 - (250 * 0.20);
			} else if (style.equals("Modern")) {
				return 250 - (250 * 0.07);
			}
		}
		return 0;
	}
	
	public String toString() {   	
		return "Order No: %s \nOrder Date: %s \nDeposit Payment: %.2f \nPrice: %.2f \nChange: %.2f"
				.formatted(custOrderNo, custOrderDate,  depositPymt, calCharges(), depositPymt - calCharges());
	}
}
