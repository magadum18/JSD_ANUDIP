package Anudip;

import mamta.ProtectedEg;

public class Student3 extends ProtectedEg{
	
	void display() {
		System.out.println(subject1 +"  "+ subject2 +"  "+ subject3 + " "+ grade);
	}
	
	public static void main(String[] args) {
		Student2 s = new Student2();
		s.subject1 = 44;
		s.subject2 = 88;
		s.subject3 = 55;
		s.grade = "C";
		s.display();
		
	}

}
