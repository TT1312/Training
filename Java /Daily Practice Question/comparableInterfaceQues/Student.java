package comparableInterfaceQues;

public class Student implements Comparable<Student>{
	int rollno;
	String name;
	int age;
	
	
	public Student(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}


	@Override
	public int compareTo(Student student) {
		// TODO Auto-generated method stub
		if(age == student.age) 
		    return 0;
		else if(age > student.age)
			return -1;
		else
			return 1;
	}
	
	
}
