package day_1.ass5;

public class WellsBankAcnt {
	static private int custIdInc;
	static private int accNumInc=1000000000;
	protected int accNum;
	protected int custId;
	protected String atmCard;
	protected String fullName;
	protected String emailId;
	protected char accType;
	protected String dateOfBirth;
	protected char gender;
	protected char maritalStatus;
	
	
	public WellsBankAcnt() {
		custIdInc++;
		accNumInc++;
		this.custId=custIdInc;
		this.accNum=accNumInc;
	}
	

	public WellsBankAcnt(String emailId, char accType, String dateOfBirth, char gender,
			char maritalStatus, String firstName, String middleName, String lastName) {
		super();
		this.emailId = emailId;
		this.accType = accType;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
		this.fullName= firstName+middleName+lastName;
	}

	public class SalaryAcnt extends WellsBankAcnt {

		public SalaryAcnt(String emailId, char accType, String dateOfBirth, char gender, char maritalStatus,
				String firstName, String middleName, String lastName) {
			super(emailId, accType, dateOfBirth, gender, maritalStatus, firstName, middleName, lastName);
		}
		public float discount(int transactionAmnt) {
			float discount=(transactionAmnt/5);
			return discount;
		}
		
	}
	public class NonSalaryAcnt extends WellsBankAcnt {

		public NonSalaryAcnt(String emailId, char accType, String dateOfBirth, char gender, char maritalStatus,
				String firstName, String middleName, String lastName) {
			super(emailId, accType, dateOfBirth, gender, maritalStatus, firstName, middleName, lastName);
		}
		
	}
}
