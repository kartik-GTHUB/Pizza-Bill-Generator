package pizzaBillGenerator;


public class Pizza {
	
	  private int price;
	  protected Boolean veg;
	  
	  private int addExtraCheeseprice = 100;
	  private int extraToppingsadded = 150;
	  private int backPackprice = 20;
	  
	  private int basePizzaPrice;
	  
	  private Boolean isExtraCheeseAdded = false;
	  private Boolean isExtraToppingsAdded = false;
	  private Boolean isOptedForTakeAway= false;
	  
	  
	  public Pizza(Boolean veg) {
		  
		  this.veg = veg;
		  if(this.veg) {
			  this.price = 300;
			  System.out.println("Pizza:" +this.price);
			  
			  
		  }
		  
		  else {
			  
			  this.price = 400;
			  System.out.println("Pizza:" +this.price);
		  }
		  basePizzaPrice = this.price;
		  
		  
		  
		  
		  
	  }
	  
	  public void getPizzaPrice() {
//		  System.out.println(this.price);
	  }
	  
	  public void addExtracheese() {
		  isExtraCheeseAdded = true;
//		  System.out.println("Extra Cheese Added");
		  this.price += addExtraCheeseprice;
		  
	  }
	  
	  public void addExtraToppings() {
		  isExtraToppingsAdded = true;
//		  System.out.println("Extra Toppings Added");
		  this.price += extraToppingsadded;
		  
	  }
	  
	  public void takeAway() {
		  isOptedForTakeAway = true;
//		  System.out.println("Take Away opted");
		  this.price += backPackprice;
		  
	  }
	  
	  public void getBill() {
		  
		  String bill = "";
		  
//		  System.out.println( "Total Amount is:" +this.price);
		  if(isExtraCheeseAdded) {
			  bill += "Extra cheese added "+addExtraCheeseprice+ "\n";
			  
		  }
		  if(isExtraToppingsAdded){
			  bill += "Extra Topping added:" +extraToppingsadded+"\n";
			  
		  }
		  if(isOptedForTakeAway) {
			  bill += "Take Away: "+backPackprice+ "\n";
			  
			  
			  
		  }
		  bill += "Bill: "+this.price + "\n";
		  System.out.println(bill);
	  }
		

}

