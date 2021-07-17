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
