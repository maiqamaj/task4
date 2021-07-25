<<<<<<< HEAD
package jo.secondstep.solid.liskovpubstitution.correct;

public class password implements passwordProvider {

	@Override
	public <T> Provider providePass(T value) {
		return new pass(value);

	}

}
=======
package jo.secondstep.solid.liskovpubstitution.correct;

public class password implements passwordProvider {

	@Override
	public <T> Provider providePass(T value) {
		return new pass(value);

	}

}
>>>>>>> 577b9ac5def7b9af9ac666408452c506715d267c
