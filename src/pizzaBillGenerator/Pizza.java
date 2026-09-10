package pizzaBillGenerator;


public class Pizza {
	
	private String price;
	
	private Boolean veg;

	public Pizza (Boolean veg) {
		this.veg = veg;
		if(this.veg) {
			this.price = "300";
		}
		else {
			this.price ="400";
		}
	}
	
	public void getPizzaPrice() {
		System.out.println(this.price);
	}
}

