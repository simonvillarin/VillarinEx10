package org.ssglobal.training.codes.itemB;

public final class CyclingGlass extends SportsVisionShoppe {
	protected boolean uvProtection;
	
	@Override
	public double calCharges() {
		if (type == 'T') {
			if (uvProtection) {
				return 300 + 30;
			}
			return 300;	
		} else if (type == 'P') {
			if (uvProtection) {
				return 350 + 30;
			}
			return 350;
		} else if (type == 'I') {
			if (uvProtection) {
				return 300 + 30;
			}
			return 400;
		}	
		return 0;
	}
	
	public String toString() {       		
		return "Order No: %s \nOrder Date: %s \nDeposit Payment: %.2f \nPrice: %.2f \nChange: %.2f"
				.formatted(custOrderNo, custOrderDate,  depositPymt, calCharges(), depositPymt - calCharges());
	}
}
