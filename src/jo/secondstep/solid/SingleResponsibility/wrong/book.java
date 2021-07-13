package jo.secondstep.solid.SingleResponsibility.wrong;

public class book {
	 private int bookNumber;
	 private String name;
	 private String datePublished;
	 private double price;
	 
	 private String authorName ;  //wrong
	 
	 
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
	 
		
		public String getAuthorName() {
			return authorName;
		}

		public void setAuthorName(String authorName) {
			this.authorName = authorName;
		}
		
		
		
	
}

