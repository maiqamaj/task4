package jo.secondstep.solid.openclosed.wrong;

public class LanguageProgramming {
	String Type;
	
	public String getType() {
		return Type;
	}

	public void setName(String Type) {
		this.Type = Type;
	}
	public void getDescriptionLanguageProgramming() { //wrong

		if (this.Type == "Java") {
			System.out.println("Java is an object-oriented programming language "
					+ "that produces software for multiple platforms." + " When a programmer writes a Java application,"
					+ " the compiled code (known as bytecode) " + "runs on most operating systems (OS),"
					+ " including Windows," + " Linux and Mac OS.");

		} else if (this.Type == "C") {
			System.out.println("C is a high-level and general-purpose programming"
					+ " language that is ideal for developing firmware or portable "
					+ "applications. Originally intended for writing system software, "
					+ "C was developed at Bell Labs by Dennis Ritchie"
					+ " for the Unix Operating System in the early 1970s");

		}
	}

}
