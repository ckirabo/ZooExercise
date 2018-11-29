package zooExercise;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//List<Animals> zoo = new LinkedList<Animals>();
		
		Cat cat1 = new Cat("Jack","Cat");
		ArrayList<Animal> zoo = new ArrayList<Animal>();
		zoo.add(cat1);
		//cat has been added
		System.out.print(cat1.makeNoise());
		
	}

}
