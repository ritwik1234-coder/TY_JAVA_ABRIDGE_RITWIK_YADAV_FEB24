package com.capgemini.quiz.day4;

public class QuizOne {
	public void m1(int i, float f) {
		System.out.println("int float method");
	}
	public void m1(float f, int i) {
		System.out.println("float int method");
	}
	public static void main(String[] args) {
		QuizOne o=new QuizOne();
		o.m1(20,20);
		/* what is the output of the following code?
		 * 
		 * a. int float method
		 * b. float int method
		 * c. compile time error
		 * d. run time error
		 * 
		 * Answer- compile time error
		 */
		
	}
	
}
