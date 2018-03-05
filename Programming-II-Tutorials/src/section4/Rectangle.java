package section4;

public class Rectangle extends Shape {
	private double length;
	private double width;

	public Rectangle(String color, double length, double width) {
		super.setColor(color);
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public void printShapeArea() {
		System.out.println("Rectangle's area : " + (length * width));

	}

	@Override
	public void printShapeMessage() {
		System.out.println("Rectangle");
	}
}
