package zooExercise;

public class Mammal extends Animal {
	////////////////////Attributes/////////////////////////
	
	String species;
	
	
	
///////////////Constructors/////////////////////////////
	public Mammal(String Vname, String Vspecies) {
		super(Vname);
		this.species = Vspecies;
	}

///////////////////methods////////////////////////////////////
	
	public String getSpecies() {
		return this.species;

}
}
