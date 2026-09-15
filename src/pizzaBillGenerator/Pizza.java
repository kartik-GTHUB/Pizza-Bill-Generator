package pizzaBillGenerator;


public class Pizza {
	
	private String price;
	private Boolean veg;
	private int extraCheesePrice = 100;
	private int extraToppingPrice = 150;
	private int backPackPrice = 20;
	public Pizza (Boolean veg) {
		this.veg = veg;
		if(this.veg) {
			this.price = "300";
		}
		else {
			this.price ="400";
		}
	}
	
	public void addExtracheese() {
	System.out.println("Extra cheese added");
	this.price += extraCheesePrice;
}
	public void addExtratopping() {
		System.out.println("Extra topping added");
		this.price += extraToppingPrice;
	}
	public void takeAway() {
		System.out.println("TakeAway Opted");
		this.price += backPackPrice;
	}
	public void getBill() {
		System.out.println(this.price);
	}
}

