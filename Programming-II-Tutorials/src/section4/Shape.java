package section4;

public abstract class Shape { // Class is abstract because we won't make an object from it
	private String color;
	protected double area;

	// No need for constructor here since it is an abstract class and there is only
	// one attribute anyway

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public abstract void calcArea(); // Method is abstract because each subclass will have its own implementation

	public void printShapeMessage() {
		System.out.print("Shape is a ");
	}
}
