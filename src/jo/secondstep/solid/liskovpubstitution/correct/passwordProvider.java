package jo.secondstep.solid.liskovpubstitution.correct;

public interface  passwordProvider {
	
	public <T> Provider providePass(T value);

}
