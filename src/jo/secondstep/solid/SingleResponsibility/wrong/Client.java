package jo.secondstep.solid.SingleResponsibility.wrong;

public class Client {
	public static void main(String[] args) {
		
		book Book=new book();
		Book.setName("Java");
		Book.setAuthorName("James Gosling");
		
		System.out.println(Book.getName() + ", Auther name : "+ Book.getAuthorName());
	}
}
