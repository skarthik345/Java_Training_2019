package day_2.ass20.package1;

/*
 * This java file is a class which is a sub class
 * of Base class
 */
/**
 * This class is a class which extends Base class
 * It has a method that gets the values of the
 * member variables of Base class
 * Date : <<Sept 26th 2019>>
 * @author <<143 & Karthik>>
 * @version 1.0
 */
public class Child1 extends Base{
	public void getValues()
	{
		System.out.println (getVariable1());
		System.out.println (getVariable2());
		System.out.println (variable3);
		System.out.println (variable4);
	}
}