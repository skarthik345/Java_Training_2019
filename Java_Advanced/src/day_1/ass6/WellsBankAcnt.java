package day_1.ass6;

class WellsBankAcnt {
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
	
	
	public int getCustIdInc() {
		return custIdInc;
	}


	public int getAccNumInc() {
		return accNumInc;
	}


	public WellsBankAcnt() {
		custIdInc++;
		accNumInc++;
		this.custId=custIdInc;
		this.accNum=accNumInc;
	}
	

	public WellsBankAcnt(String emailId, char accType, String dateOfBirth, char gender,
			char maritalStatus, String firstName, String middleName, String lastName) {
		this();
		this.emailId = emailId;
		this.accType = accType;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
		this.fullName= firstName+middleName+lastName;
	}


	public static void main(String[] args) {
		WellsBankAcnt acc1 = new SalaryAcnt("Paul@Wellsfargo.com", 'S', "3rdJan1985", 'M', 'S', "Paul", "J", "Anderson");
		WellsBankAcnt acc2 = new NonSalaryAcnt("John@Wellsfargo.com", 'M', "6thMarch1985", 'M', 'M', "John", "" , "Jacob");
		System.out.println(acc1.toString()+"\n"+acc2.toString());

	}


	@Override
	public String toString() {
		return "WellsBankAcnt [accNum=" + accNum + ", custId=" + custId + ", atmCard=" + atmCard + ", fullName="
				+ fullName + ", emailId=" + emailId + ", accType=" + accType + ", dateOfBirth=" + dateOfBirth
				+ ", gender=" + gender + ", maritalStatus=" + maritalStatus + "]";
	}
}
	class SalaryAcnt extends WellsBankAcnt {

		public SalaryAcnt(String emailId, char accType, String dateOfBirth, char gender, char maritalStatus,
				String firstName, String middleName, String lastName) {
			super(emailId, accType, dateOfBirth, gender, maritalStatus, firstName, middleName, lastName);
		}
		public float discount(int transactionAmnt) {
			float discount=(transactionAmnt/5);
			return discount;
		}
		
	}	
	class NonSalaryAcnt extends WellsBankAcnt {

		public NonSalaryAcnt(String emailId, char accType, String dateOfBirth, char gender, char maritalStatus,
				String firstName, String middleName, String lastName) {
			super(emailId, accType, dateOfBirth, gender, maritalStatus, firstName, middleName, lastName);
		}
		
	}
