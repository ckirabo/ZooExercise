package zooExercise;

public class Falcon extends Bird implements NoiseInterface{
   ////////////Attributes//////////////////
	
	
	
	//////Constructors/////////////////////
	
	public Falcon(String Vname, String Vspecies) {
		super(Vname, Vspecies);
	}
	
	
	//////////Methods//////////////////
	
	
	public String makeNoise() {
		return "Skqquuaaa";
	}
	
	public String toString() {
		return   "Name " + this.getName() +
		        " Species " + this.getSpecies() +
		        " Present ? " + makeNoise();
		
	}
	
}
