package jo.secondstep.solid.SingleResponsibility.correct;

public class book {
	 private int bookNumber;
	 private String name;
	 private double price;
	 private String datePublished;
	 private auther Author ;  //correct
	 
	 
	 public int getBookNumber() {
			return bookNumber;
		}

		public void setBookNumber(int bookNumber) {
			this.bookNumber = bookNumber;
		}

	 public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		public double getPrice() {
			return price;
		}

		
		public void setPrice(double price) {
			this.price = price;
		}
		
		public String getDatePublished() {
			return datePublished;
		}

		public void setDatePublished(String datePublished) {
			this.datePublished = datePublished;
		}
		
		
		public auther getAuther() {
			return Author;
		}

		public void setauther(auther Author) {
			this.Author = Author;
		}

	 
}

