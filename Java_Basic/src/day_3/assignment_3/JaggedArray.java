package day_3.assignment_3;

public class JaggedArray {

	public static void main(String[] args) {
		String jaggedArrayMatrix[][]={{"Tony", "JAVA","C","C++"},{"Thomas","JAVA","UNIX"},{"Dinil","Linux","Oracle"},{"Delvin","RDBMS","C#","ORACLE"}};
		System.out.println("Details of Courses registered by Delvin:");
		for(int i=1;i<jaggedArrayMatrix[3].length;i++) {
				System.out.println(" "+i+". "+jaggedArrayMatrix[3][i]);
		}

	}
}
