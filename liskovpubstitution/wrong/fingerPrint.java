<<<<<<< HEAD:src/jo/secondstep/solid/liskovpubstitution/wrong/fingerPrint.java
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
=======
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
>>>>>>> 577b9ac5def7b9af9ac666408452c506715d267c:src/secondstep/sloid/liskovpubstitution/wrong/fingerPrint.java
