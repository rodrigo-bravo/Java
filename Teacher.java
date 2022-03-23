package school.management.system;

/**
 * @author rodrigo-bravo
 * Teacher class is responsible for keeping track
 * of teacher's name, id, and salary.
 */

public class Teacher {
	
	private int id;
	private String name;
	private int salary;
	private int salaryEarned;
	
	/**
	 * Creates a new Teacher object.
	 * @param id - id for the teacher.
	 * @param name - name of the teacher.
	 * @param salary - salary of the teacher.
	 */
	public Teacher(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.salaryEarned = 0;
	}
	
	/**
	 * Getter and setter methods for teachers at school.
	 * @return
	 */
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}
	
	/**
	 * Adds to salary.
	 * Removes from the total money earned by Williams College.
	 * @param salary
	 */
	public void receiveSalary(int salary) {
		salaryEarned +=salary;
		School.updateTotalMoneySpent(salary);
	}
	@Override
	public String toString() {
		return "Teacher's name: " +name+ 
				". The total salary earned so far is $" + salaryEarned + ".";
	}
}
