<<<<<<< HEAD:src/jo/secondstep/solid/liskovpubstitution/correct/point.java
package jo.secondstep.solid.liskovpubstitution.correct;

public class point<T> implements Provider{
private T Point;
	
	public  point(T value) {
		this.Point = value;
	}

	public T getpass() {
		return (T) Point;
	}	
}
=======
package jo.secondstep.solid.liskovpubstitution.correct;

public class point<T> implements Provider{
private T Point;
	
	public  point(T value) {
		this.Point = value;
	}

	public T getpass() {
		return (T) Point;
	}	
}
>>>>>>> 577b9ac5def7b9af9ac666408452c506715d267c:src/secondstep/sloid/liskovpubstitution/correct/point.java
