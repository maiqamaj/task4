package jo.secondstep.solid.Interfacesegregation.correct;


public class sampleMachine implements nescafeMachine{
	 private double milk =500;
	    private double nascafe =100;
	    private double suger=0;
	    private double Price= 100;
	@Override
	public void makenescafe(double sugar) {
		this.suger=suger;
		double Nascafe=this.suger+nascafe+suger;
		System.out.println("Nascafe is Done ");
		
	}

	@Override
	public double drinkPrice(double price) {
		return price-this.Price;
	}

}
