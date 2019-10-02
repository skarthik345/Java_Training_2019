package day_2.ass20.package2;

import day_2.ass20.package1.Base;

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
public class Child2 extends Base{
	public void getValues() {
		@SuppressWarnings("unused")
		Base base=new Base();
		System.out.println (variable3); // Line 1
//		System.out.println (base.variable3); // Line 2
		System.out.println (variable4);
	}
}