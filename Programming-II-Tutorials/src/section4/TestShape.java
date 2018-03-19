package section4;

import java.util.ArrayList;

public class TestShape {
	public static void main(String[] args) {

		// Circle circle1 = new Circle("Blue", 100); // (Static binding)
		Shape circle2 = new Circle("Red", 10); // Upcasting (Dynamic binding)

		// Polymorphic array
		ArrayList<Shape> shapesArray = new ArrayList<>();

		shapesArray.add(circle2);
		shapesArray.add(new Rectangle("Blue", 10, 10));

		for (Shape shape : shapesArray) {
			shape.printShapeMessage(); // Different implementations for printShapeArea method
			System.out.println("Shape's color: " + shape.getColor());
			shape.calcArea();
			System.out.println("Shape's area: " + shape.getArea() + "\n==========================");

		}
	}
}