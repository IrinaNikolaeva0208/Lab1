package bsu.rfe.java.group10.lab1.Nikolaeva.varB5;

public class MainApplication {

	public static void main(String[] args) throws Exception {
		Food[] breakfast = new Food[20];
		int itemsSoFar = 0;
		for (String arg: args) {
			  String[] parts = arg.split("/");
		      if (parts[0].equals("Cheese")) 
		            breakfast[itemsSoFar] = new Cheese();
		      else
		      if (parts[0].equals("Apple"))
		            breakfast[itemsSoFar] = new Apple(parts[1]);
		      else
		      if (parts[0].equals("Hamburger"))
		            breakfast[itemsSoFar] = new Burger(parts[1]);
		      itemsSoFar++;
		}
		
		for(int i=0; i<breakfast.length; i++) 
		      if (breakfast[i]!=null) 
		    	  breakfast[i].consume();
		
		System.out.println("Have a nice day!");
	    }
}
	

