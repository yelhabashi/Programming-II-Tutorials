
package section2;

import java.util.ArrayList;

public class Student {

	// Class Attributes
	public String name;
	public int id;
	public int term;
	private double gpa;
	private static int numStudents = 0;
	private int subjectLimit;
	ArrayList<String> subjects = new ArrayList<String>();   // **Updated** Used to be Array of Strings - Check enroll function
															// ArrayList is a list implementation [Data Structure]
	
	// Class Constructor
	Student(String name, int id) {   // We could implement some type of constraints check here too
		this.name = name;
		this.id = id;
		this.term = 1;
		this.gpa = 0;
		this.subjectLimit = 6;
		numStudents++;
	}

	// constructor overload
	Student(String name, int id, int term) {
		this.name = name;
		this.id = id;
		this.term = term;
		this.gpa = 0;
		this.subjectLimit = 6;
		numStudents++;
	}
	
	// Another constructor overload
	public Student(String name, int id, int term, double gpa) {
		super();
		this.name = name;
		this.id = id;
		this.term = term;
		this.gpa = gpa;
	}
	
	
	// Setters & Getters
	void setGpa(float gpa) {
		if (gpa >= 0 && gpa <= 4)		// Notice: Used setter for constraints
			this.gpa = gpa;
	}

	double getGpa() {
		return this.gpa;
	}
	
	// Methods
	
	// **Updated** 
	void enroll(String subject) {     
		if(this.subjects.size()<this.subjectLimit)
		{
			subjects.add(subject);				//Simply append new subject
		}	
		else
		System.out.println("Maximum number of subjects reached");	
	}
	
	// **New**
	void withdraw(String subject) {                       
		subjects.remove(subject);
	}
	

	// **New**
	public int getNumStudents()
	{
		return numStudents;
	}
}
