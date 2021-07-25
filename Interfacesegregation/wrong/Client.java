package jo.secondstep.solid.Interfacesegregation.wrong;

import java.util.ArrayList;
import java.util.List;

public class Client  {

	
	public static void main(String[] args) {
	     
		System.out.println("nescafe printer");
		nescafePrinter nescafeprinter=new nescafePrinter();
		nescafeprinter.makenescafe(10);
	
		nescafeprinter.selectdrawing("flower");
		System.out.println("The remainder of the amount : "+nescafeprinter.drinkPrice(200));
		
		System.out.println("\nsample Machine");
		sampleMachine samble=new sampleMachine();
		samble.makenescafe(10);
		samble.selectdrawing("flower");
		System.out.println("The remainder of the amount : "+samble.drinkPrice(200));
		
		
		
		
	}
}
