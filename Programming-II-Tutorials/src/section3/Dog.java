package section3;

public class Dog extends Animal { // Dog "is an" Animal, that's why it inherits Animal characteristics

	public String breed;
	private boolean isFluffy;

	public Dog(String name, String breed) {
		super(name, "Dog"); // Calling constructor in parent class
		this.breed = breed;
		isFluffy = false;
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
		System.out.println("Bark");
	}

	@Override // **Updated**
	public void describe() {
		if (isFluffy == true)
			System.out.println(this.name + " is a(n) " + this.breed + " " + this.species + " which if fluffy and is "
					+ this.age + " years old");
		else
			System.out.println(this.name + " is a(n) " + this.breed + " " + this.species
					+ " which is not fluffy and is " + this.age + " years old");
	}

	// **Updated**
	public void fetchBall() {
		System.out.println(this.name + " is fetching the ball");
	}
}
