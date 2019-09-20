package java_b.day_2;

//Program to understand the loop and break
class Assignment2{
	public static void main(String args[]){
		for(int i= 0; i<5 ; i++){
			for(int j = 0; j<10; j++){
				System.out.print(j +"\t");
				if(j > 5){
					break;
				}
			}
			System.out.println("Outer Loop");
		}
		System.out.println("End");
	}
}