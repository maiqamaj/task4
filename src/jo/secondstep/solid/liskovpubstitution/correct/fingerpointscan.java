<<<<<<< HEAD:src/jo/secondstep/solid/liskovpubstitution/correct/fingerpointscan.java
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
=======
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
>>>>>>> 577b9ac5def7b9af9ac666408452c506715d267c:src/secondstep/sloid/liskovpubstitution/correct/fingerpointscan.java
