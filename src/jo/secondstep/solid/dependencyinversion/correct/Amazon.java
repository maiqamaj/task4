package jo.secondstep.solid.dependencyinversion.correct;

import java.util.HashMap;

public class Amazon implements shopping{
	private HashMap clothesOrder;
	public Amazon(HashMap clothesOrder)
	{
		
		this.clothesOrder=clothesOrder;
	    
	}
	@Override
	public void Clothes() {
		
		System.out.println( "Clothes order from Amazon");
		int item =0;
		for (Object i : this.clothesOrder.keySet()) {
		      System.out.println("order "+ ++item +" is : "+ i + " quantity  is : " + clothesOrder.get(i));
		    }
	}
	@Override
   public int Price()
   {   int price=0;
	   for (Object i : this.clothesOrder.keySet()) {
		   if (i=="dress")
			   price= price+ (40 *(int) clothesOrder.get(i));
		   else if (i=="handbag")
			   price= price+ (50 *(int) clothesOrder.get(i));
		   else if (i=="heel")
			   price= price+ (30 *(int) clothesOrder.get(i));
	   }
	   return price;
   }

	


}
