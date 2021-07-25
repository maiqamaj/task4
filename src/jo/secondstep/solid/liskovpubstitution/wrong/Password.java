<<<<<<< HEAD:src/jo/secondstep/solid/liskovpubstitution/wrong/Password.java
package jo.secondstep.solid.liskovpubstitution.wrong;

public class Password implements safe{
	
	int password;
    
	Password(int pass)
	{
		this.password=pass;
	}
	
	@Override
	public void openSafe(int number) {
		if (this.password==number)
			System.out.println("correct , Safe is opened");	
		
	}

	@Override
	public void closeSafe() {
		
		System.out.println("Safe is closed");	
		
	}
	
	

}

=======
package jo.secondstep.solid.liskovpubstitution.wrong;

public class Password implements safe{
	
	int password;
    
	Password(int pass)
	{
		this.password=pass;
	}
	
	@Override
	public void openSafe(int number) {
		if (this.password==number)
			System.out.println("correct , Safe is opened");	
		
	}

	@Override
	public void closeSafe() {
		
		System.out.println("Safe is closed");	
		
	}
	
	

}

>>>>>>> 577b9ac5def7b9af9ac666408452c506715d267c:src/secondstep/sloid/liskovpubstitution/wrong/Password.java
