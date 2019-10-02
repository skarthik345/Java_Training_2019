package day_4.assignment_8;

public class DayScholar extends Student {
	private String residentialAddress;

	public DayScholar() {
		super();
	}

	public DayScholar(int id, char type, String firstName, String lastName, double semFees, String residentialAddress) {
		super(id, type, firstName, lastName);
		calculateFees(semFees);
		this.residentialAddress = residentialAddress;
	}

	public String getResidentialAddress() {
		return residentialAddress;
	}
	public void displayStudentDetails() {
		super.displayStudentDetails();
		System.out.println(" Residential Address = "+this.getResidentialAddress());
	}

	public void calculateFees(double semFee) {
		this.feesPerMonth=semFee/6;
	}

}
