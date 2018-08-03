public class Garage {
	public Car[] cars;
	
	
	public static void main(String[] args) {
		Garage a1 = new Garage();
		a1.cars = new Car[4];
		
		Car a = new Car(123,"great");
		Car b = new Car(123,"great");
		Car c = new Car(124,"narak");
		Car d = new Car(124,"narak");
		a1.cars[0] = a;
		a1.cars[1] = b;
		a1.cars[2] = c;
		a1.cars[3] = d;
		
		//System.out.println("--------------------");
		a1.removeDup();
		System.out.println(a1.cars.length);
		System.out.println(a1.cars[0]);
		System.out.println(a1.cars[1]);
		
		
	}
	public void removeDup() {
		for (int i = 0 ; i < cars.length ; i++) {
			for (int j = i+1 ; j < cars.length ; j++) {
				if (cars[i] == null || cars[j] == null) continue;
				if (cars[i].equals(cars[j])) {
					this.cars[j] = null;
				}
			}
		}
		int count = 0;
		for (int i = 0 ; i < cars.length ; i++) {
			if (cars[i] == null) count++;
		}
		Car[] get = new Car[cars.length-count];
		int j = 0;
		for (int i = 0 ; i < cars.length ; i++) {
			if (cars[i] == null) continue;
			get[j++] = cars[i];
		}
		cars = get;
	}
}
