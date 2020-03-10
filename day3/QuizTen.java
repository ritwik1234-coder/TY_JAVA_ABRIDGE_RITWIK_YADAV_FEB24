package com.capgemini.quiz.day3;

public class QuizTen {
	public static void main(String[] args) {
		int sum=0;
		for(int i=0, j=0; i<5 & j<5; i++,j=i+1)
			sum+=1;
		System.out.println(sum);
		
		/* what is output/
		 * a.5b
		 * b.6
		 * c.14
		 * d. compilation error
		 * 
		 * Answer- 6
		 */
		
	}

}
