package secondstep.sloid.liskovpubstitution.correct;



public class Tester<T> {
	
	 
	public void test(safe Safe) {

		Safe.openSafe(ProviderFactory.getPassProvider(Safe), 123456);
		Safe.closeSafe();
	}

}
