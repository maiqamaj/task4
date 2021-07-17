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
