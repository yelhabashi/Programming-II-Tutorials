package section4;

public class Circle extends Shape {
	private double radius;
	

	public Circle(String color, double radius) {
		super.setColor(color); // Setting color using setter
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void calcArea() {
		 super.setArea(Math.PI * Math.pow(radius, 2)); // Math is a built-in class
	}

	@Override
	public void printShapeMessage() {
		super.printShapeMessage();
		System.out.println("circle");
	}

}
