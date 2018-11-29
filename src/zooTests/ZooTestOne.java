package zooTests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import zooExercise.Animal;
import zooExercise.Cat;
import zooExercise.Chicken;
import zooExercise.Main;

public class ZooTestOne {

	
	@Test
	public void testIsAnimalAMammal() {
		ArrayList<Animal> a = new ArrayList<>();
		Cat newCat = new Cat("Doink","Cat");
		a.add(newCat);
		
		assertTrue("This is not a Mammal", Main.isMammal(newCat));
	}
	
	@Test
	public void testIsAnimalABird() {
		ArrayList<Animal> a = new ArrayList<>();
		Chicken newChick = new Chicken("Dot", "Chicken");
		a.add(newChick);
		assertTrue("This is not a Mammal", Main.isBird(newChick) );
	}
	
	
	
}
