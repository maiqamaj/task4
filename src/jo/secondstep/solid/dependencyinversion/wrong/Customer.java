package jo.secondstep.solid.dependencyinversion.wrong;

import java.util.HashMap;

public class Customer {

	
	private sheinShopping SheinShopping = new sheinShopping();

	public shine order(HashMap clothesOrder) {
		return SheinShopping.provideClothes(clothesOrder);
	}
}
