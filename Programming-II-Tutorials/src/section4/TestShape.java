package section4;

public class TestShape {
	public static void main(String[] args) {

		// Circle circle1 = new Circle("Blue", 100); // (Static binding)

		Shape circle2 = new Circle("Red", 10); // Upcasting (Dynamic binding)

		// Polymorphic array
		Shape[] shapesArray = new Shape[2];
		shapesArray[0] = circle2;
		shapesArray[1] = new Rectangle("Blue", 10, 10);


		for (Shape shape : shapesArray) {
			shape.printShapeMessage(); // Different implementations for printShapeArea method
			System.out.println("Shape's color: " + shape.getColor());
			shape.calcArea();
			System.out.println("Shape's area: " + shape.getArea() + "\n==========================");

		}
	}
}