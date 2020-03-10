package com.capgemini.quiz.day6;

public class QuizFive {
	public static int foo(int a, String s)
	{
	 s = "Yellow";
	a=a+2;
	return a;
	}
	public static void bar()
	{
	int a=3;
	String s = "Blue";
	a = foo(a,s);
	System.out.println("a="+a+" s="+s);
	}
	public static void main(String args[]) {
	
	bar();
	}

	/*What is printed on execution of these methods?
     * a. a = 3 s = Blue
     * b. a = 5 s = Yellow
     * c. a = 3 s = Yellow
	 * d. a = 5 s = Blue 
	 * e. none of the above
	 * 
	 * Answer- a = 5 s = Blue
	 */

}
