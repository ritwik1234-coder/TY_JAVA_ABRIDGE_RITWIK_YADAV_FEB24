package com.capgemini.quiz.day3;

public class QuizFour {
	public static void main(String[] args) {
		int x,y=1;
		x=10;
		if(x !=10 && x/0==0)
			System.out.println(y);
		else
			System.out.println(++y);
		
		/* what will be the output of the following java code?
		 * a.1
		 * b.2
		 * c.runtime error owing to division by zero in if condition
		 * d.Unpredicatable behaviour
		 * 
		 * Answer- 2
		 * 
		 */
	}

}
