package day_4.assignment_3;

public class DayScholar extends Student {
	private String residentialAddress;

	public DayScholar() {
		super();
	}

	public DayScholar(int id, char type, String firstName, String lastName, double feesPerMonth, String residentialAddress) {
		super(id, type, firstName, lastName);
		super.setFeesPerMonth(feesPerMonth);
		this.residentialAddress = residentialAddress;
	}

	public String getResidentialAddress() {
		return residentialAddress;
	}
	public void displayStudentDetails() {
		super.displayStudentDetails();
		System.out.println(" Residential Address = "+this.getResidentialAddress());
	}

}
