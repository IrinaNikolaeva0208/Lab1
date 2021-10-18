package bsu.rfe.java.group10.lab1.Nikolaeva.varB5;

public class Burger extends Food {

private String size;
	
	public Burger(String size) {
		super("Hamburger");
		this.size=size;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public void consume() {
		System.out.println(this+" was eaten");
	}

	@Override
	public boolean equals(Object arg0) {
		if(!super.equals(arg0)) return false;
		if (!(arg0 instanceof Burger)) return false;
		return size.equals(((Burger)arg0).size);
	}

	@Override
	public String toString() {
		return "A "+super.toString()+" of '"+size.toUpperCase()+"' size";
	}

	
	

}
