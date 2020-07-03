package org.niki.fundamentals.overridingexample;

public class Car {
	String color;
	int price;
	String brand;

	public Car(String color, int price, String brand) {
		this.color = color;
		this.price = price;
		this.brand = brand;
	}

	public static void main(String[] args) {
		Car c = new Car("Black", 3456789, "Audi");
		System.out.println(c);
		Car c1 = new Car("Blue", 234234, "BMW");
		System.out.println(c1);

		String name = "Mahesh";
		System.out.println(name);
	}
}
