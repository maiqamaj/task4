package jo.secondstep.solid.openclosed.wrong;

public class Client {
	public static void main(String[] args) {
		
		LanguageProgramming Language=new LanguageProgramming();
		Language.setName("Java");
		
		Language.getDescriptionLanguageProgramming();
        Language.setName("C++");
		Language.getDescriptionLanguageProgramming();
		
	}
}
