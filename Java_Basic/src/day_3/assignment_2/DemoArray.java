package day_3.assignment_2;

public class DemoArray {

	public static void main(String[] args) {
		int firstArrayMatrix[][]={{1,1,1},{1,1,1}};
		int secondArrayMatrix[][]={{2,2,2},{2,2,2}};
		System.out.println("Matrix 1");
		for(int i=0;i<firstArrayMatrix.length;i++) {
			for(int j=0;j<=firstArrayMatrix.length;j++) {
				System.out.print(" "+firstArrayMatrix[i][j]);
			}
			System.out.println("");
		}
		System.out.println("\nMatrix 2");
		for(int i=0;i<secondArrayMatrix.length;i++) {
			for(int j=0;j<=secondArrayMatrix.length;j++) {
				System.out.print(" "+secondArrayMatrix[i][j]);
			}
			System.out.println("");
		}
		System.out.println("\nSum of the matrices");
		for(int i=0;i<secondArrayMatrix.length;i++) {
			for(int j=0;j<=secondArrayMatrix.length;j++) {
				System.out.print(" "+(firstArrayMatrix[i][j]+secondArrayMatrix[i][j]));
			}
			System.out.println("");
		}
	}

}
