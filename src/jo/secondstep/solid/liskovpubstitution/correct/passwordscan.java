
package jo.secondstep.solid.liskovpubstitution.correct;

public class passwordscan implements safe {

	private int Password;

	@Override
	public void openSafe(passwordProvider PasswordProvider, Object value) {
		pass P = new pass(value);

		Password = P.getpass();
		System.out.println("--------password scanning--------");
		System.out.println("Safe is opened");

	}

	@Override
	public void closeSafe() {
		System.out.println("Safe is closed");

	}
}