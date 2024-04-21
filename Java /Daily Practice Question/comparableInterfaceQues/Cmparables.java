package comparableInterfaceQues;

import java.util.ArrayList;
import java.util.Collections;

public class Cmparables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> stud = new ArrayList<Student>();
		
		stud.add(new Student(10,"Nikhil",22));
		stud.add(new Student(8,"Sauabh",12));
		stud.add(new Student(56,"Akshy",87));
		stud.add(new Student(41,"Tushar",45));
		
		Collections.sort(stud);
		
		for (Student st : stud) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
		
		
	}

}
