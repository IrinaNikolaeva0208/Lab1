package bsu.rfe.java.group10.lab1.Nikolaeva.varB5;

public class Cheese extends Food {

	public Cheese() {
		super("Cheese");
	}

	@Override
	public void consume() {
		System.out.println(this+" was eaten");
	}

}