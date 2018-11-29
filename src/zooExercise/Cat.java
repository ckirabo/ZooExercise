package zooExercise;

public class Cat extends Mammal implements NoiseInterface{

	//////////////Attributes//////////////////////
	
	
	
	
	////////////Constructors//////////////////////
	public Cat(String Vname, String Vspecies) {
		super(Vname, Vspecies);
	}
	

	///////////Methods///////////////////////////
	
	public String getCatInfo() {
		return "Name " + this.getName() +
		        " Species " + this.getSpecies();
	}

	
	public String makeNoise() {
		return "Meow";
	}
	
		
}
