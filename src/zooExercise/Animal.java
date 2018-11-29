package zooExercise;

public abstract class Animal {

	////////////////////Attributes/////////////////////////
	
	String name;
	
	///////////////Constructors/////////////////////////////
	
	public Animal (String Vname) {
		this.name = Vname;	
	}
	
///////////////////methods////////////////////////////////////
	
	public String getName() {
		return this.name;
	}
	
}
