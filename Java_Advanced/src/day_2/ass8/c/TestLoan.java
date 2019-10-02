package day_2.ass8.c;

public class TestLoan {
	public static void main (String[] args) {
		Loan l1 = Loan.getLoanInstance();
		Loan l2 = Loan.getLoanInstance();
		Loan l3 = Loan.getLoanInstance();
		Loan l4 = Loan.getLoanInstance();
		Loan l5 = Loan.getLoanInstance();
		Loan l6 = Loan.getLoanInstance();
		System.out.println(l1+" "+l2+" "+l3+" "+l4+" "+l5+" "+l6);
		System.out.println("Number of instances :"+Loan.getNumberOfObjects());
	}
}
