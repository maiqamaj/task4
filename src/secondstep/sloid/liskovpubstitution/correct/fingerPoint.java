package secondstep.sloid.liskovpubstitution.correct;

public class fingerPoint implements passwordProvider{

	@Override
	public <T> Provider providePass(T value) {
		return new point(value);
	}

}
