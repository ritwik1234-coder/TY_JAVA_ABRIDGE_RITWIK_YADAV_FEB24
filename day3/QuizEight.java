package com.capgemini.quiz.day3;

public class QuizEight {
	public static void main(String[] args) {
		int sum=0;
		for(int i=0, j=0; i<5 & j<5; i++,j=i+1)
			sum+=i;
		System.out.println(sum);
		
		/* what will be the output ofthe following program?
		 * a.5
		 * b.6
		 * c.14
		 * d. error
		 * 
		 * Answer- 6
		 */
		
	}

}
