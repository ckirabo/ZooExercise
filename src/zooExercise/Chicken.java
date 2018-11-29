package zooExercise;

public class Chicken extends Bird implements NoiseInterface {

	////////////Attributes/////////////////
	
	
	
	
	///////////Constructors///////////////////
	
	public Chicken(String Vname, String Vspecies) {
		super(Vname, Vspecies);
	}
	
	
	///////////Method//////////////////////
	
	public String makeNoise() {
		return "Cockadooodle doooo";
	}
	
	public String toString() {
		return   "Name " + this.getName() +
		        " Species " + this.getSpecies() +
		        " Present ? " + makeNoise();
		
	}
	

}
