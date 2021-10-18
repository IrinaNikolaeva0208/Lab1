package bsu.rfe.java.group10.lab1.Nikolaeva.varB5;

public class Apple extends Food {

public String size;
	
	public Apple (String size) {
		super("Apple");
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
		if (!(arg0 instanceof Apple)) return false;
		return size.equals(((Apple)arg0).size);
	}

	@Override
	public String toString() {
		return "An "+super.toString()+" of '"+size.toUpperCase()+"' size ";
	}

	}


