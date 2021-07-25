<<<<<<< HEAD:src/jo/secondstep/solid/liskovpubstitution/correct/ProviderFactory.java
package jo.secondstep.solid.liskovpubstitution.correct;

public class ProviderFactory {
	private static password Password = new password();
	private static fingerPoint FingerPoint = new fingerPoint();

	public static passwordProvider getPassProvider(safe Safe) {
		
		passwordProvider P =null;
		
		if (Safe instanceof fingerpointscan) {
			P =  FingerPoint;
		}
		else if (Safe instanceof passwordscan) {
			P =  Password;
		}
		
		return P;
		
		
		
		
		
		
		
	}


}
=======
package jo.secondstep.solid.liskovpubstitution.correct;

public class ProviderFactory {
	private static password Password = new password();
	private static fingerPoint FingerPoint = new fingerPoint();

	public static passwordProvider getPassProvider(safe Safe) {
		
		passwordProvider P =null;
		
		if (Safe instanceof fingerpointscan) {
			P =  FingerPoint;
		}
		else if (Safe instanceof passwordscan) {
			P =  Password;
		}
		
		return P;
		
		
		
		
		
		
		
	}


}
>>>>>>> 577b9ac5def7b9af9ac666408452c506715d267c:src/secondstep/sloid/liskovpubstitution/correct/ProviderFactory.java
