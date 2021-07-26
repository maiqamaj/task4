package jo.secondstep.solid.dependencyinversion.wrong;

import java.util.HashMap;

public class Client {
	
	public static void main(String[] args) {

		Customer customer = new Customer();
	    HashMap<String, Integer> Clothes = new HashMap<String, Integer>();
	    Clothes.put("dress",4);
	    Clothes.put("heel",2);
	    Clothes.put("handbag",1);
		shine order = customer.order(Clothes);
		
		order.Clothes();
		System.out.println("The amount is : "+order.Price());
	}

}
