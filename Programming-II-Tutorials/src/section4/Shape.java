package section4;


public abstract class Shape { // Class is abstract because we wont make an object from it
	private String color;

	// No need for constructor here since it is an abstract class and there is only
	// one attribute anyway

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public abstract void printShapeArea(); // Method is abstract because is each subclass will have its own
											// implementation

	public void printShapeMessage() {
		System.out.println("Shape");
	}
}
