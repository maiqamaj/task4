package jo.secondstep.solid.liskovpubstitution.wrong;

public class Tester {
	
	public void test(safe Safe) {

		Safe.openSafe(123456);
		Safe.closeSafe();
	}


}
