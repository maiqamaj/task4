package secondstep.sloid.liskovpubstitution.correct;

public interface  passwordProvider {
	
	public <T> Provider providePass(T value);

}
