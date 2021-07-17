package jo.secondstep.solid.liskovpubstitution.wrong;

public class fingerPrint  implements safe{
    String point;
    
    fingerPrint(String point)
	{
		this.point=point;
	}
	
	@Override
	public void openSafe(int number) {
		throw new UnsupportedOperationException("Cannot open the safe");
		
	}

	@Override
	public void closeSafe() {
		System.out.println("Safe is closed");	
		
	}
	

}
