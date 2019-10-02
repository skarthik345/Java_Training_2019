package day_5.assignment_2.registrationpack;

import day_5.assignment_2.studentpack.Student;

class DayScholar extends Student{
	protected String residentialAddress;
	public void setResAddress(String resAddress){
		this.residentialAddress=resAddress;
	}
	public void getDetails(){
		System.out.println("Student Id:"+studentId);
		System.out.println("Student Type:"+studentType);
		System.out.println("Student Name:"+studentName);
	}
}
class Registration{
	public static void main(String args[]){
		DayScholar dayScholar=new DayScholar();
		dayScholar.setStudentId(1001);
		dayScholar.setStudentType('D');
		dayScholar.setStudentName("Dinil");
		dayScholar.getDetails();
		dayScholar.setResAddress("Best location");
		System.out.println(dayScholar.residentialAddress);
	}
}