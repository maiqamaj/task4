package secondstep.sloid.liskovpubstitution.correct;

import java.util.ArrayList;
import java.util.List;

public class Client {
	
	
	public static void main(String[] args) {
		
		Tester tester = new Tester();
		
		List<safe> Safe = new ArrayList<safe>();
		
		
		Safe.add(new passwordscan());
		
		
		Safe.add(new fingerpointscan());
		for (safe s : Safe) {
			tester.test(s);
		}
	}

}
