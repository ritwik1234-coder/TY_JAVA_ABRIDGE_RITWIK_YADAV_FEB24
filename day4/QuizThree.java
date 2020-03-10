package com.capgemini.quiz.day4;

public class QuizThree {
	int x;
	int y;
	void add(int a) {
		x=a+1;
	}
	void add(int a,int b) {
		x=a+2;
	}

    	public static void main(String[] args) {
    		QuizTwo t=new QuizTwo();
    		int a=0;
    		t.add(6,7);
    		System.out.println(t.x);
    		
    		/* what is the o/p of the following code?
    		 * a. 9
    		 * b. 6
    		 * c. 7
    		 * d. 8
    		 * 
    		 * Answer- 8
    		 */

    }
}
