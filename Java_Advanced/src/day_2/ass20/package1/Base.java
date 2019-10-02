package day_2.ass20.package1;

/*
 * This java file is a class which has 4 member variables
 * with different access specifiers
 */
/**
 * This class is a class that has 4 member variables
 * with different access specifiers
 * It also has 2 methods to access the variables
 * Date : <<Sept 26th 2019>>
 * @author <<143 & Karthik>>
 * @version 1.0
 */
public class Base {
	int variable1;
	private int variable2;
	protected int variable3;
	public int variable4;
	/*
	 * Default Constructor that initializes the member variables
	 */
	public Base () {
		variable1=100;
		variable2=200;
		variable3=300;
		variable4=400;
	}
	/*
	 * Returns the value of the member variable variable1
	 */
	int getVariable1(){
		return variable1;
	}
	/*
	 * Returns the value of the member variable variable2
	 */
	public int getVariable2(){
		return variable2;
	}
}