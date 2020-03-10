package com.capgemini.quiz.day6;

public class QuizEight {
	public static void main(String[] arr){ 
        Integer num1 = 100; 
        Integer num2 = 100; 
        Integer num3 = 500; 
        Integer num4 = 500; 
          
        if(num1==num2){ 
            System.out.println("num1 == num2"); 
        } 
        else{ 
            System.out.println("num1 != num2"); 
        } 
        if(num3 == num4){ 
            System.out.println("num3 == num4"); 
        } 
        else{ 
            System.out.println("num3 != num4"); 
            /* what is the o/p?
             * a. num1 == num2
             *    num3 == num4
             * b. num1 == num2
             *    num3 != num4
             * c. num1 != num2
             *    num3 == num4
             * d. num1 != num2
             *    num3 != num4
             *    
             * Answer- num1 == num2
             *         num3 != num4
             */
        } 
	}
}
