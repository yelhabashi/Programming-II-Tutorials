package section2;

public class TestStudent {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student yasmine = new Student("Yasmine", 2083, 4); 
		System.out.println(yasmine.name + "-" + yasmine.id + " is a term " + yasmine.term + " student with gpa " + yasmine.getGpa());
		System.out.println("Number of students is: " + yasmine.getNumStudents());
		yasmine.setGpa(3);
		System.out.println(yasmine.name + "-" + yasmine.id + " is a term " + yasmine.term + " student with gpa " + yasmine.getGpa());
		System.out.println("");
		
		Student tarek = new Student("Tarek",3571);
		System.out.println(tarek.name + "-" + tarek.id + " is a term " + tarek.term + " student with gpa " + tarek.getGpa());
		System.out.println("Number of students is: " + tarek.getNumStudents());   //Try changing "tarek." with "yasmine."  
		System.out.println("");
		
		yasmine.enroll("Programming 2");
		yasmine.enroll("Data Structures");
		System.out.println("Yasmine's subjects are: ");
		for(int i=0;i<yasmine.subjects.size();i++)
		{
			System.out.println(yasmine.subjects.get(i));
		}
		System.out.println("");
		
		yasmine.withdraw("Programming 2");
		System.out.println("Yasmine's subjects are: ");
		for(int i=0;i<yasmine.subjects.size();i++)
		{
			System.out.println(yasmine.subjects.get(i));
		}
	}

}
