package zooExercise;

import java.util.ArrayList;

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
			
	    System.out.println(cat1.toString());
	    System.out.println(dog1.toString());
	    System.out.println(falcon1.toString());
	    System.out.println(chicken1.toString());
	}

}
