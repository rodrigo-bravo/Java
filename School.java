package school.management.system;
import java.util.List;
/**
 * @author rodrigo-bravo
 * School class accounts for all teachers and students.
 * Implements array list.
 */

public class School {
	
	private List<Teacher> teachers;
	private List<Student> students;
	private static int totalMoneyEarned;
	private static int totalMoneySpent;
	
	/**
	 * Creates new school object.
	 * @param teachers
	 * @param students
	 */
	public School(List<Teacher> teachers, List<Student> students) {
		this.teachers = teachers;
		this.students = students;
		totalMoneyEarned = 0;
		totalMoneySpent = 0;
	}
	
	/**
	 * Getter and setter methods 
	 * @return
	 */	
	public List<Teacher> getTeachers(){
		return teachers;
	}
	
	public void addTeachers(Teacher teacher){
		teachers.add(teacher) ;
	}
	
	public List<Student> getStudents(){
		return students;
	}
	
	/**
	 * adds student to the school
	 * @param student the student to be added
	 */
	public void addStudents(Student student){
		students.add(student);
	}
	
	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}
	
	/**
	 * adds the total money earned by the school.
	 * @param MoneyEarned
	 */
	public static void updateTotalMoneyEarned(int MoneyEarned) {
		totalMoneyEarned += MoneyEarned;
	}
	
	/**
	 * @return the total money spent by the school.
	 */
	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}
	
	/**
	 * Update the money that is spent by the school
	 * which is paying for teachers's salaries.
	 * @param MoneySpent
	 */
	public static void updateTotalMoneySpent(int MoneySpent) {
		totalMoneyEarned-=MoneySpent;
	}	
}
