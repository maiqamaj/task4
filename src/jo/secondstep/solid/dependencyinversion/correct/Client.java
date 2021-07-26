package jo.secondstep.solid.dependencyinversion.correct;

import java.util.HashMap;




public class Client {
	public static void main(String[] args) {

		Customer customer = new Customer();
		
		ShoppingProvider shoppingProvider= new ShoppingProviderFactory().get("Amazon");
	
		customer.setShoppingProvider(shoppingProvider);
	    HashMap<String, Integer> Clothes = new HashMap<String, Integer>();
	    Clothes.put("dress",3);
	    Clothes.put("heel",5);
	    Clothes.put("handbag",3);
		shopping order = customer.order(Clothes);
		
        
		
		order.Clothes();
		System.out.println("The amount is : "+order.Price());
	}
}
