package section3;

public abstract class Animal { // Class is abstract because we will never instantiate it

	public String name;
	public String species;
	protected boolean hasTail; // **New** Protected to be seen only within subclasses
	protected int numLegs;
	protected int age;

	public Animal(String name, String species) {
		this.name = name;
		this.species = species;
	}

	public abstract void describe(); // Method is abstract because is each subclass will have its own implementation

	// **Updated**
	public void makeSound() {
		System.out.println(this.name + " is making sounds!");
	}

}
