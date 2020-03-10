package com.capgemini.quiz.day4;

public class QuizFive {
	int width; 
	int area;
	int length;
	public void area(int width, int length) {
		this.width=width;
		this.length=length;
	}
	public static void main(String[] args) {
		QuizFive f=new QuizFive();
		f.area(5,6);
		System.out.println(f.length+" "+ f.width);
		/* what is the o/p of the following code?
		 * a. 0 0
		 * b. 5 6
		 * c. 6 5
		 * d. 5 5
		 * 
		 * Answer- 6 5
		 */
	}

}
