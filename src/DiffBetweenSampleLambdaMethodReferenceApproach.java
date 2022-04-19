interface If {
	public Student get(String name, int rollno, int marks, int age);
}

class Student {
	String name;
	int rollno;
	int marks;
	int age;

	public Student(String name, int rollno, int marks, int age) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
		this.age = age;
	}
}
//simple form of coding
/*
 * class Demo implements If {
 * 
 * @Override public Student get(String name, int rollno, int marks, int age) {
 * Student s = new Student(name, rollno, marks, age); return s; }
 * 
 * }
 */

public class DiffBetweenSampleLambdaMethodReferenceApproach {

	public static void main(String[] args) {
		/*
		 * Demo demo = new Demo(); Student s=demo.get("faizan", 363585, 85, 26);
		 */
		// lambda expression...
		// If if1 = (name, rollno, marks, age) -> new Student("faizan", 363585, 85, 26);
		// Constructor reference..
		If if1 = Student::new;

	}

}
