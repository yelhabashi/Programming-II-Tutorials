package section3;

public class TestAnimals {

	public static void main(String[] args) {
		
		Lion simba = new Lion("Simba","African");
		Dog pluto = new Dog("Pluto","Bloodhound");
		
		/*  //   The ability of upcasting (Casting of subclass to superclass - where superclass is not an abstract class)
		Animal a = new Lion("a","Lion");
		System.out.println(a.name);
		a = simba;
		System.out.println(a.name);
		*/
		
		/*  //   The ability of downcasting (Casting of superclass to subclass - where superclass is not an abstract class)
		Animal a = new Lion("S","l");
		System.out.println(simba.name);
		simba = (Lion) a;
		System.out.println(a.name);
		System.out.println(simba.name);
		*/
		
		simba.describe();
		pluto.describe();
		
		simba.makeSound();
		pluto.makeSound();
		
		simba.setAge(5);
		simba.describe();
		
		pluto.fetchBall();
	}

}
