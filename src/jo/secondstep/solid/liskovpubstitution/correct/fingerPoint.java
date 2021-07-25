<<<<<<< HEAD:src/jo/secondstep/solid/liskovpubstitution/correct/fingerPoint.java
package jo.secondstep.solid.liskovpubstitution.correct;

public class fingerPoint implements passwordProvider{

	@Override
	public <T> Provider providePass(T value) {
		return new point(value);
	}

}
=======
package jo.secondstep.solid.liskovpubstitution.correct;

public class fingerPoint implements passwordProvider{

	@Override
	public <T> Provider providePass(T value) {
		return new point(value);
	}

}
>>>>>>> 577b9ac5def7b9af9ac666408452c506715d267c:src/secondstep/sloid/liskovpubstitution/correct/fingerPoint.java
