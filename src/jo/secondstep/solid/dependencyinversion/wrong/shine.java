package jo.secondstep.solid.dependencyinversion.wrong;

import java.util.HashMap;

public class shine {
	private HashMap clothesOrder;
	public shine(HashMap clothesOrder)
	{
		
		this.clothesOrder=clothesOrder;
	    
	}
	public void Clothes() {
		
		System.out.println( "Clothes order from Shein");
		int item =0;
		for (Object i : this.clothesOrder.keySet()) {
		      System.out.println("order "+ ++item +" is : "+ i + " quantity  is : " + clothesOrder.get(i));
		    }
	}
	
   public int Price()
   {   int price=0;
	   for (Object i : this.clothesOrder.keySet()) {
		   if (i=="dress")
			   price= price+ (20 *(int) clothesOrder.get(i));
		   else if (i=="handbag")
			   price= price+ (5 *(int) clothesOrder.get(i));
		   else if (i=="heel")
			   price= price+ (10 *(int) clothesOrder.get(i));
	   }
	   return price;
   }
	

}
