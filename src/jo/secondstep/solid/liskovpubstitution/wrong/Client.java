package jo.secondstep.solid.liskovpubstitution.wrong;
import java.util.ArrayList;
import java.util.List;

public class Client {
	
	
	public static void main(String[] args) {
		
		Tester tester = new Tester();
		
		List<safe> Safe = new ArrayList<safe>();
		
		
		Safe.add(new Password(123456));
		
		
		Safe.add(new fingerPrint("123456"));
		for (safe s : Safe) {
			tester.test(s);
		}
	}

}
