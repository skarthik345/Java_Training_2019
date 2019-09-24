package day_4.assignment_3;

public class Hostelite extends Student {
	private String hostelName;
	private int roomNumber;

	public Hostelite() {
		super();
	}

	public Hostelite(int id, char type, String firstName, String lastName, double feesPerMonth, String hostelName, int roomNumber) {
		super(id, type, firstName, lastName);
		super.setFeesPerMonth(feesPerMonth);
		this.hostelName = hostelName;
		this.roomNumber = roomNumber;
	}

	public String getHostelName() {
		return hostelName;
	}

	public int getRoomNumber() {
		return roomNumber;
	}
	
	public void displayStudentDetails() {
		super.displayStudentDetails();
		System.out.println(" Hostel Name = "+this.getHostelName()+
				" Room No.= "+this.getRoomNumber());
	}

}
