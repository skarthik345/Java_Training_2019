package day_4.assignment_1;

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

	public static void main(String[] args) {
		Hostelite Hostelite = new Hostelite(25, 'F', "Ka", "Si", 2500.50, "Best Hostel", 143);
		System.out.println(" Student details are:  ID= "+Hostelite.getStudentID()+" type= "+Hostelite.getStudentType()+" Name= "+Hostelite.getStudentName()+
				" Total fees per month= "+Hostelite.getFeesPerMonth()+" Hostel Name = "+Hostelite.getHostelName()+
				" Room No.= "+Hostelite.getRoomNumber());
		
	}
}
