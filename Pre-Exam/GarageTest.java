import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GarageTest {

	@Test
	public void testRemoveDup01() {
		Garage g = new Garage();
		g.cars = new Car[3];

		Car a = new Car(111, "Honda");
		Car b = new Car(112, "Toyota");
		Car c = new Car(111, "Honda");

		g.cars[0] = a;
		g.cars[1] = b;
		g.cars[2] = c;

		g.removeDup();

		assertEquals(2, g.cars.length);
		assertEquals(a, g.cars[0]);
		assertEquals(b, g.cars[1]);

	}

	@Test
	public void testRemoveDup02() {
		Garage g = new Garage();
		g.cars = new Car[3];

		Car a = new Car(112, "Toyota");
		Car b = new Car(111, "Honda");
		Car c = new Car(111, "Honda");

		g.cars[0] = a;
		g.cars[1] = b;
		g.cars[2] = c;

		g.removeDup();

		assertEquals(2, g.cars.length);
		assertEquals(a, g.cars[0]);
		assertEquals(b, g.cars[1]);

	}

	@Test
	public void testRemoveDup03() {
		Garage g = new Garage();
		g.cars = new Car[3];

		
		Car a = new Car(111, "Honda");
		Car b = new Car(111, "Honda");
		Car c = new Car(112, "Toyota");

		g.cars[0] = a;
		g.cars[1] = b;
		g.cars[2] = c;

		g.removeDup();

		assertEquals(2, g.cars.length);
		assertEquals(a, g.cars[0]);
		assertEquals(c, g.cars[1]);

	}

	@Test
	public void testRemoveDup04() {
		Garage g = new Garage();
		g.cars = new Car[4];

		
		Car a = new Car(111, "Honda");
		Car b = new Car(112, "Toyota");
		Car c = new Car(111, "Honda");
		Car d = new Car(112, "Toyota");

		g.cars[0] = a;
		g.cars[1] = b;
		g.cars[2] = c;
		g.cars[3] = d;

		g.removeDup();

		assertEquals(2, g.cars.length);
		assertEquals(a, g.cars[0]);
		assertEquals(b, g.cars[1]);
	}

	@Test
	public void testRemoveDup05() {
		Garage g = new Garage();
		g.cars = new Car[6];

		
		Car a = new Car(111, "Honda");
		Car b = new Car(112, "Toyota");
		Car c = new Car(111, "Honda");
		Car d = new Car(113, "Nissan");
		Car e = new Car(112, "Toyota");
		Car f = new Car(111, "Honda");

		g.cars[0] = a;
		g.cars[1] = b;
		g.cars[2] = c;
		g.cars[3] = d;
		g.cars[4] = e;
		g.cars[5] = f;

		g.removeDup();

		assertEquals(3, g.cars.length);
		assertEquals(a, g.cars[0]);
		assertEquals(b, g.cars[1]);
		assertEquals(d, g.cars[2]);
	}

}
