package jo.secondstep.solid.dependencyinversion.wrong;

import java.util.HashMap;

public class sheinShopping {
	
	public shine provideClothes(HashMap clothesOrder) {

		return new shine(clothesOrder);
	}

}
