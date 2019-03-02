package demo;

class person {
	
	String fName;
	String lName;
	int age;
	
	
	void howOld(String fn, int ag) {
		System.out.println(fn + " is " + ag + " years old.");
		
	}
	
	
}



public class oop {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		person person1 = new person();
		person1.fName = "Roger";
		person1.lName = "Le Page";
		person1.age = 59;
		person1.howOld(person1.fName, person1.age);

	}

}
