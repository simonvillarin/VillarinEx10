package org.ssglobal.training.codes.itemA;

public sealed abstract class Cake permits OrderedCake, ReadyMadeCake, WholesaleCake {
	protected String name;
	protected double rate;
	
	public abstract double calcPrice();
	
	public String toString() {
		return name + "\t" + rate;
	}
}
