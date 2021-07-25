package jo.secondstep.solid.Interfacesegregation.correct;

public class nescafePrinter implements nescafeMachine,nescafePrinterMachine{
	private double milk =500;
    private double nascafe =100;
    private double suger=0;
    private double Price= 200;
    private String drawing; 
	@Override
	public void makenescafe(double sugar) {
		this.suger=suger;
		double Nascafe=this.suger+nascafe+suger;
		System.out.println("Nascafe without drawing ");
		
	}

	@Override
	public double drinkPrice(double price) {
		// TODO Auto-generated method stub
				return Price-price;
	}

	@Override
	public void selectdrawing(String drawing) {
		this.drawing=drawing;
		System.out.println("Nascafe is Done ");
		
	}

}
