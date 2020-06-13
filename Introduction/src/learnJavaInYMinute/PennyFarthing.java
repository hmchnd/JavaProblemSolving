package learnJavaInYMinute;

public class PennyFarthing extends Bicycle  {
	
	 public PennyFarthing(int startCadence, int startSpeed) {
	        // Call the parent constructor with super
	        super(startCadence, startSpeed, 0, "PennyFarthing");
	    }
	 
	 @Override
	    public void setGear(int gear) {
	        this.gear =gear;
	    }

	 
	 
	  public static void main(String[] args) {
		  Bicycle trek = new Bicycle(21,5,5,"Hulk");
		  PennyFarthing pF = new PennyFarthing(12, 23);
		  pF.setGear(56);
		  System.out.println(trek.gear);
		  System.out.println(trek.cadence);
		  System.out.println(trek.name);
		  System.out.println(pF.getCadence());
		  System.out.println(pF.gear);
		  System.out.println(trek.gear);
		  
	  }
	 
	 
	 
}
