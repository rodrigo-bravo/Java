package school.management.system;

/**
 * @author rodrigo-bravo
 * Student class is responsible for keeping track 
 * of student fees (such as for attending school), 
 * name, grade, and fees paid.
 */
public class Student {
	
	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;
	
	/**
	 * Creates a new student object by initializing the values.
	 * Case scenario: fees for every student is a one time fee 
	 * of $10,000 to attend school this year.
	 * Fees paid initially is 0.
	 * @param id unique id for the student.
	 * @param name name of the student.
	 * @param grade school grade of the student.
	 */
	public Student(int id, String name, int grade) {
		this.feesPaid= 0;
		this.feesTotal=10000;
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	
	/**
	 * Method keeps adding the fees to feesPaid Field.
	 * example: feespaid = 2500 + 5000 + 2500 = 10000 -> fees are paid.
	 * Add the fees to the fees paid, which will be 
	 * received by the school.
	 * @param fees
	 */
	public void payFees(int fees) {
		feesPaid+=fees;
		School.updateTotalMoneyEarned(feesPaid);
	}
	
	/**
	 * Getter and setter methods to alter and/or return 
	 * student values.
	 * @param grade
	 */
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public int getID() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public int getFeesPaid() {
		return feesPaid;
	}
	
	public int getFeesTotal() {
		return feesTotal;
	}
	
	public int getRemainingFees() {
		return feesTotal-feesPaid;
	}
	@Override
	public String toString() {
		return "Student's name: " +name+ ". The total fees paid so far is $" + feesPaid +".";
	}
}
