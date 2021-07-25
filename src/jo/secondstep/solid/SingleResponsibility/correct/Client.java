package jo.secondstep.solid.SingleResponsibility.correct;

import jo.secondstep.solid.SingleResponsibility.wrong.book;

public class Client {
	public static void main(String[] args) {
	
		book Book=new book();
		Book.setName("Java");
		
		auther Auther = new auther();
		Auther.setName("James Gosling");
		System.out.println(Book.getName() + ", Auther name : "+ Auther.getName());

	
	}
}
