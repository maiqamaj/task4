package jo.secondstep.solid.dependencyinversion.correct;

import java.util.HashMap;

public class sheinShopping implements  ShoppingProvider {

	@Override
	public shopping provideClothes(HashMap clothesOrder) {
		
		return new shine(clothesOrder);
	}

}
