package oopsConcept;

public class RunnerTest {

	public static void main(String[] args) {

		Bike honda = new Bike(100);
		Bike ducati = new Bike(200);

		System.out.println(honda.getSpeed());
		System.out.println(ducati.getSpeed());

		honda.setSpeed(100);

	}

}
