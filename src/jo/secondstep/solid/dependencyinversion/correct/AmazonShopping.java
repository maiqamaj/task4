package jo.secondstep.solid.dependencyinversion.correct;

import java.util.HashMap;

public class AmazonShopping implements ShoppingProvider {

	@Override
	public shopping provideClothes(HashMap clothesOrder) {
		// TODO Auto-generated method stub
		return new Amazon(clothesOrder);
	}

	

}
