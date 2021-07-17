package secondstep.sloid.liskovpubstitution.wrong;

public class Tester {
	
	public void test(safe Safe) {

		Safe.openSafe(123456);
		Safe.closeSafe();
	}


}
