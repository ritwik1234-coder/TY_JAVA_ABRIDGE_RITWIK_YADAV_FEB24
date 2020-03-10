package com.capgemini.quiz.day4;

public class QuizSix {
	public static void main(String[] args) {
		int []x[]= {{1,2}, {3,4,5}, {6,7,8,9}};
		int [] [] y=x;
		System.out.println(y[2][1]);
		/* what will be the o/p?
		 * a. 2
		 * b. 3
		 * c. 7
		 * d. compilation error
		 * 
		 * Answer- 7
		 */
	}

}
