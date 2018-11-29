package zooExercise;

public class Dog extends Mammal implements NoiseInterface {
     ///////////////////Attributes//////////////////////
	
	
	
	
	
	/////////////////Constructors////////////////////
	
	public Dog(String Vname, String Vspecies) {
		super(Vname, Vspecies);
	}
	
	
	
	///////////////Methods/////////////////////////////
		
	public String makeNoise() {
		return "Bork!";
	}
	
	public String toString() {
		return   "Name " + this.getName() +
		        " Species " + this.getSpecies() +
		        " Present ? " + makeNoise();
		
	}
}
