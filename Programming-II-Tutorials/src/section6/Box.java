package section6;

public class Box<T> { // "T" could be any letter but it's common practice to name it T

	T material;

	public Box(T material) { // In the constructor we are sending an object of another class so "material"
								// attribute is actually an object from another class
		this.material = material;
	}

	public void printMaterial() {
		System.out.println(material); // Here we are printing a class, if a class is ever printed by default its
										// "toString()" method is called, which is a method inherited from "Object"
										// class [Remember? Parent of all classes]
	}

}
