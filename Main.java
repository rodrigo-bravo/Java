package school.management.system;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Teacher Alex = new Teacher(1,"Alex", 50500);
		Teacher Walter = new Teacher(2,"Walter", 47500);
		Teacher Victor = new Teacher(3,"Victor", 48920);
		
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(Alex);
		teacherList.add(Walter);
		teacherList.add(Victor);
		
		Student Michael = new Student(1, "Michael", 9);
		Student Christian = new Student(2, "Christian", 9);
		Student Raul = new Student(3, "Raul", 11);
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(Michael);
		studentList.add(Christian);
		studentList.add(Raul);
		
		School williamsCollege = new School(teacherList, studentList);
		System.out.println("Williams College has earned $" +  williamsCollege.getTotalMoneyEarned() + ".");
		
		Michael.payFees(5000);
	}

}
