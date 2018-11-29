package zooExercise;

public class Cat extends Mammal implements NoiseInterface{

	//////////////Attributes//////////////////////
	
	
	
	
	////////////Constructors//////////////////////
	public Cat(String Vname, String Vspecies) {
		super(Vname, Vspecies);
	}
	

	///////////Methods///////////////////////////
	
	
	public String makeNoise() {
		return "Meow!";
	}
	
	public String toString() {
		return   "Name " + this.getName() +
		        " Species " + this.getSpecies() +
		        " Present ? " + makeNoise();
		
	}
		
}
