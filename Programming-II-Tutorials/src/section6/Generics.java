package section6;

public class Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Box<Wood> woodBox = new Box<>(new Wood());
		Box<Iron> ironBox = new Box<>(new Iron());
		Box<Glass> glassBox = new Box<>(new Glass());

		woodBox.printMaterial();
		ironBox.printMaterial();
		glassBox.printMaterial();
		
	}

}
