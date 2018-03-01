package section3;

public class Lion extends Animal { // Lion "is an" Animal, that's why it inherits Animal characteristics

	public String breed;
	private boolean isStriped;

	public Lion(String name, String breed) {
		super(name, "Lion"); // Calling constructor in parent class
		this.breed = breed;
		isStriped = true;
	}

	// **New**
	public void setAge(int age) {
		this.age = age;
	}

	// **New**
	public int getAge() {
		return age;
	}

	@Override // To indicate using this function instead of one in parent class
	public void makeSound() {
		super.makeSound(); // Calling function of same name in parent class
		System.out.println("Roar");
	}

	@Override // **Updated**
	public void describe() {
		if (isStriped == true)
			System.out.println(this.name + " is a(n) " + this.breed + " " + this.species + " which has stripes and is "
					+ this.age + " years old");
		else
			System.out.println(this.name + " is a(n) " + this.breed + " " + this.species
					+ " which doesn't have stripes and is " + this.age + " years old");
	}
}
