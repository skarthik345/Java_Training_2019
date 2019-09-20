package java_b.day_1;

// Program to understand different types of operators
class Assignment7{
	public static void main(String[] args){
		boolean bool1 = true;
		boolean bool2 = true;
		if(bool1 && (bool1 && (bool2=true))){
			System.out.println("Success");
		}
		else{
			System.out.println("Failure");
		}
		System.out.println("bool2 value : " + bool2);
	}
}