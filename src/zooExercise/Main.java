package zooExercise;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//List<Animals> zoo = new LinkedList<Animals>();
		
		Cat cat1 = new Cat("Jack","Cat");
		Dog dog1 = new Dog("Bob" , "Dog");
		Falcon falcon1 = new Falcon("Perry", "Falcon");
		Chicken chicken1 = new Chicken("Daisy", "Chicken");
		
		ArrayList<Animal> zoo = new ArrayList<Animal>();
		
		
		zoo.add(cat1);
		zoo.add(dog1);
		zoo.add(falcon1);
		zoo.add(chicken1);
		

		ArrayList<Animal> Mammal = (ArrayList<Animal>) zoo.stream()
				.filter(a -> isMammal(a))
				.collect(Collectors.toList());
	
		
		
		ArrayList<Animal> Bird = (ArrayList<Animal>) zoo.stream()
				.filter(b -> isBird(b))
				.collect(Collectors.toList());

		
		for(int i = 0; i< Mammal.size(); i++) {

			System.out.println("Mammal "+ i + " " + Mammal.get(i));
			
		}
		
		for(int j = 0; j< Bird.size(); j++) {

			System.out.println("Bird "+ j + " " + Bird.get(j));
			
		}
		
		
	
	}
	
	
	public static boolean isMammal(Animal a) {
		
		if(a instanceof Mammal) {
			return true;
		}
		else {	
		return false;}
	}
	
	
	
	
	public static boolean isBird(Animal b) {
		if (b instanceof Bird) {
			return true;
		}
		else {
			return false;
		}
	}
	


}
