package jo.secondstep.solid.SingleResponsibility.correct;

public class auther {
	   private String name;
	   private String dateOfBirth;
	   private String country;
	   private gender Gender; 
	   
	   
	   public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDateOfBirth() {
			return dateOfBirth;
		}

		public void setDateOfBirth(String dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
		
		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}
		

		public gender getAuther() {
			return Gender;
		}

		public void setauther(gender Gender) {
			this.Gender = Gender;
		}
	   
}
