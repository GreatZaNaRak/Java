public class Car {
	private int serial;
	private String brand;
	
	public Car(int a , String b) {
		serial = a;
		brand = b;
	}
	public boolean equals(Object o) {
		Car go = (Car) o;
		return (serial == go.serial && brand == go.brand);
	}
	
}
