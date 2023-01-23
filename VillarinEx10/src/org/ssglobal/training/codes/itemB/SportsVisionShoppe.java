package org.ssglobal.training.codes.itemB;

public sealed abstract class SportsVisionShoppe permits CyclingGlass, SwimmingGlass{
	protected String custOrderNo;
	protected String custOrderDate;
	protected float depositPymt;
	protected char type;
	
	public abstract double calCharges();
}
