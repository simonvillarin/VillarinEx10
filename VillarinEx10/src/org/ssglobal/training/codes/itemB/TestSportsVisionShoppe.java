package org.ssglobal.training.codes.itemB;

import java.time.LocalDate;

public class TestSportsVisionShoppe {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		
		CyclingGlass cg = new CyclingGlass();
		cg.custOrderNo = "123";
		cg.custOrderDate = now.toString();
		cg.depositPymt = 1000;
		cg.type = 'T';
		cg.uvProtection = true;
		cg.calCharges();
		System.out.println(cg.toString());
		
		System.out.println("---------------------------");
		
		SwimmingGlass sg = new SwimmingGlass();
		sg.custOrderNo = "1234";
		sg.custOrderDate = now.toString();
		sg.depositPymt = 1000;
		sg.type = 'A';
		sg.style = "Modern";
		sg.calCharges();
		System.out.println(sg.toString());
	}

}
