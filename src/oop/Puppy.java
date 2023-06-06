package oop;

public class Puppy {

	public Puppy(String name ) {
		System.out.println("Passed Name is : "+name);
	}
	public Puppy() {
		System.out.println("It is default constructor");
	}
	public static void main(String[]args) {
		Puppy myPuppy = new Puppy("tomas");
		Puppy myPuppy1 = new Puppy("linhtut");
		
		Puppy p = new Puppy();
		System.out.println(p);
		Puppy p4 = new Puppy("David");
	}

}
