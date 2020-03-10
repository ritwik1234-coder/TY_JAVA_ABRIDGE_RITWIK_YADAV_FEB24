package com.capgemini.quiz.day3;

public class QuizTwo {
	public static void main(String[] args) {
		boolean a= true;
		boolean b= !true;
		boolean c= a|b;
		boolean d= a&b;
		boolean e=d?b:c;
		System.out.println(d+" "+e);
		
		/* what will be the output of the following java code?
		 * a.false false
		 * b.true true
		 * c.true false
		 * d.false true
		 * 
		 * Answer- false true
		 */
	}

}
