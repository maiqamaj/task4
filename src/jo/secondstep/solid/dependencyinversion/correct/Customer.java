package jo.secondstep.solid.dependencyinversion.correct;

import java.util.HashMap;


public class Customer {
   private ShoppingProvider shoppingProvider;

public ShoppingProvider getShoppingProvider() {
	return this.shoppingProvider;
}

public void setShoppingProvider(ShoppingProvider shoppingProvider) {
	this.shoppingProvider = shoppingProvider;
}
public shopping order(HashMap clothesOrder) {
	return this.shoppingProvider.provideClothes(clothesOrder);
}
}
