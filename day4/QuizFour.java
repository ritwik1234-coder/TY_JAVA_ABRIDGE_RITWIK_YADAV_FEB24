package com.capgemini.quiz.day4;

public class QuizFour {
	int width; 
	int height;
	int length;
	int volume;
	 protected void finalize() {
		volume= width*height*length;
		System.out.println(volume);
	}
	protected void volume() {
		volume= width*height*length;
		System.out.println(volume);
		
	}
	public static void main(String[] args) {
		QuizFour f=new QuizFour();
		f.width=5;
		f.height=5;
		f.length=6;
		f.volume();
		
		/* what is the o/p of the following code?
		 * a. 150
		 * b. 200
		 * c. compilation error
		 * d. run time error
		 * 
		 * Answer- 150
		 */
	}

}
