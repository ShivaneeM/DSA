package stack;

public class Student {

	private int rollNo;
	private String name;
	private double fees;
	
	public Student() {
		this.rollNo=0;
		this.name=null;
		this.fees=0.0;
	}

	public Student(int rollNo, String name, double fees) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.fees = fees;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", fees=" + fees + "]";
	}
	
	
}
