package jo.secondstep.solid.dependencyinversion.correct;

import java.util.HashMap;

public class ShoppingProviderFactory {
	


	public  ShoppingProvider get(String Shopping)
	{    ShoppingProvider Provider =null;
		if (Shopping=="Shine")
			Provider = new sheinShopping();
		else if (Shopping=="Amazon")
			Provider = new AmazonShopping();
	return Provider;
	
	}
	
	

}
