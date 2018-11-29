package zooExercise;

public class Bird extends Animal{
////////////////////Attributes/////////////////////////
	
	String species;
	
	
	
	
	
///////////////Constructors/////////////////////////////
	public Bird(String Vname, String Vspecies ) {
		super(Vname);
		this.species = Vspecies;
	}

///////////////////methods////////////////////////////////////
	
	public String getSpecies() {
		return this.species;
	}
}
