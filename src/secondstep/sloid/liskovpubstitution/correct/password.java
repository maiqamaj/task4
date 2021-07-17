package secondstep.sloid.liskovpubstitution.correct;

public class password implements passwordProvider{

	
	@Override
	public <T> Provider providePass(T value) {
		return new pass(value);
		
	}

}
