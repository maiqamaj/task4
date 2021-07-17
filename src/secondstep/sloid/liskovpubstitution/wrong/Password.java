package secondstep.sloid.liskovpubstitution.wrong;

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

