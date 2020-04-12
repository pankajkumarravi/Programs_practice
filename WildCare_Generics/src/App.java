import java.util.ArrayList;
import java.util.List;

import javax.lang.model.element.Element;

class Vehicle {
	private int id;

	public Vehicle(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + "]";
	}

	void info() {
		System.out.println("  Vehicle ID is " + getId());
	}
}

class Car extends Vehicle {
	private String Carmodel;

	public Car(int id, String carmodel) {
		super(id);
		Carmodel = carmodel;
	}

	@Override
	public String toString() {
		return "Car [Carmodel=" + Carmodel + "]";
	}

	public String getCarmodel() {
		return Carmodel;
	}

	public void setCarmodel(String carmodel) {
		Carmodel = carmodel;
	}

	@Override
	void info() {
		System.out.println(" Car Model is " + getCarmodel());
	}
}

public class App {
	public static void main(String[] args) {

		List<Vehicle> vehiclesal = new ArrayList();
		vehiclesal.add(new Vehicle(10));
		vehiclesal.add(new Vehicle(12));
		vehiclesal.add(new Vehicle(14));
		vehiclesal.add(new Vehicle(15));
		vehiclesal.add(new Vehicle(20));
		vehiclesal.add(new Car(21, "A14"));

		// vehiclesal.add(new String("A String Object"));
		display(vehiclesal);
	}

	/*
	 * public static void display(List<? extends Vehicle> list) { //upoper limit for
	 * for(Vehicle element : list) { // System.out.println(element); element.info();
	 * } }
	 */

	public static void display(List<? super Car> list) { // upoper limit for
		for (Object element : list) {
			//System.out.println(element);
			element.in
		}

	}

}
