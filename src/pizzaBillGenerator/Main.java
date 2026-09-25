package pizzaBillGenerator;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
//		Pizza basePizza = new Pizza(false);
//		basePizza.addExtratopping();
//		basePizza.addExtracheese();;
//		basePizza.takeAway();
//		basePizza.getBill();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("****PIZZA BILLING SYSTEM****");
		
		
		// Choose Normal/Delux
		
		System.out.println("Choose Pizza:");
		System.out.println("1. Normal Pizza");
		System.out.println("2. Deluxe Pizza");

		int pizzaChoice = sc.nextInt();

		
		// Veg / Non-Veg
		
		System.out.println("Choose Pizza Type:");
		System.out.println("1. Veg Pizza");
		System.out.println("2. Non Veg Pizza");

		int choice = sc.nextInt();

		Pizza pizza;

		if(pizzaChoice == 1) {

		    if(choice == 1) {
		        pizza = new Pizza(true);
		    } else {
		        pizza = new Pizza(false);
		    }

		} else {

		    if(choice == 1) {
		        pizza = new DeluxePizza(true);
		    } else {
		        pizza = new DeluxePizza(false);
		    }
		}
		
		// For Extra Cheese
		
		
		// For Extra Cheese

		if(pizzaChoice == 1) {

		    System.out.println("Do You Want Extra Cheese? (Choose 1/2)");
		    System.out.println("1. Yes");
		    System.out.println("2. No");

		    choice = sc.nextInt();

		    if(choice == 1) {
		        pizza.addExtracheese();
		    }
		}
		
       
		// For Extra Toppings

		if(pizzaChoice == 1) {

		    System.out.println("Do You Want Extra Toppings? (Choose 1/2)");
		    System.out.println("1. Yes");
		    System.out.println("2. No");

		    choice = sc.nextInt();

		    if(choice == 1) {
		        pizza.addExtraToppings();
		    }
		}
		
		
		
		// For takeAway
		
        System.out.println("Do You Want Takeaway? (Choose 1/2)");
		
		System.out.println("1. Yes");
		
		System.out.println("2. No");
		
		choice = sc.nextInt();
		
		if(choice == 1) {
			pizza.takeAway();
			}
		
		
		pizza.getBill();
		
		sc.close();
		
		
	}
}

