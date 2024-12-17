package com.demo.abstractDemo;

public class Maggi extends Food{

	@Override
	public void prepare() {
		   System.out.println("\nInstructions:");
	        System.out.println("1. Heat Water: In a pan, add 1½ cups of water and bring it to a boil.");
	        System.out.println("2. Add Seasoning: Add the Maggi seasoning packet and stir well.");
	        System.out.println("3. Cook Noodles: Add the noodles and cook for 2 minutes.");
	        System.out.println("4. Add Veggies (Optional): Add any chopped veggies you like and cook for an additional 1–2 minutes, until the noodles are soft.");
	        System.out.println("5. Serve: Once the water is absorbed and the noodles are well-cooked, turn off the heat, and your Maggi is ready to eat!");
		
	}

}
