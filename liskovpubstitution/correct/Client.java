<<<<<<< HEAD:src/jo/secondstep/solid/liskovpubstitution/correct/Client.java
package jo.secondstep.solid.liskovpubstitution.correct;

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
=======
package jo.secondstep.solid.liskovpubstitution.correct;

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
>>>>>>> 577b9ac5def7b9af9ac666408452c506715d267c:src/secondstep/sloid/liskovpubstitution/correct/Client.java
