package section4;

public class Circle extends Shape {
	private double radius;

	public Circle(String color, double radius) {
		super.setColor(color);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void printShapeArea() {
		System.out.println("Circle's Area : " + (Math.PI * Math.pow(radius, 2))); // Math is a built-in class
	}

	// Overloading the previous method by changing the arguments
	public void printShapeArea(double radius) {
		setRadius(radius);
		System.out.println("Circle's Area : " + (Math.PI * Math.pow(radius, 2)));
	}

	@Override
	public void printShapeMessage() {
		System.out.println("Circle");
	}

}
