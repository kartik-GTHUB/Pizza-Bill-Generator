package pizzaBillGenerator;

public class DeluxePizza extends Pizza{
	
public DeluxePizza(Boolean veg) {
	
		super(veg);
		super.addExtracheese();
		super.addExtraToppings();
		
		
	}
	
	@Override
	
	public void addExtracheese() {}
	
	
	@Override
	public void addExtraToppings() {}

	
	
	

}