
package jo.secondstep.solid.liskovpubstitution.correct;

public interface safe<T> {
	
	public void openSafe(passwordProvider  PasswordProvider , T value  );

	public void closeSafe();

}