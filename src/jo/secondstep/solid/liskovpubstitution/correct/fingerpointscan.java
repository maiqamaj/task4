package jo.secondstep.solid.liskovpubstitution.correct;

public class fingerpointscan<T> implements safe {
	private T fingerpoint;

	@Override
	public void openSafe(passwordProvider PasswordProvider, Object value) {
		point P = new point(value);
		fingerpoint = (T) P.getpass();
		System.out.println("-------Fingerprint scanning------");
		System.out.println("Safe is opened");

	}

	@Override
	public void closeSafe() {
		System.out.println("Safe is closed");

	}

}
