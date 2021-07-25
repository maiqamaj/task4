<<<<<<< HEAD:src/jo/secondstep/solid/liskovpubstitution/correct/Tester.java
package jo.secondstep.solid.liskovpubstitution.correct;

public class Tester<T> {
	
	 
	public void test(safe Safe) {

		Safe.openSafe(ProviderFactory.getPassProvider(Safe), 123456);
		Safe.closeSafe();
	}

}
=======
package jo.secondstep.solid.liskovpubstitution.correct;

public class Tester<T> {
	
	 
	public void test(safe Safe) {

		Safe.openSafe(ProviderFactory.getPassProvider(Safe), 123456);
		Safe.closeSafe();
	}

}
>>>>>>> 577b9ac5def7b9af9ac666408452c506715d267c:src/secondstep/sloid/liskovpubstitution/correct/Tester.java
