package secondstep.sloid.liskovpubstitution.correct;

public class pass<T> implements Provider {

	private T pass;

	public pass(T value) {
		this.pass = value;
	}

	public int getpass() {
		return (int) pass;
	}

}
