package com.capgemini.quiz.day5;

public class QuizTwo {
	   public static void main(String[] args) {  
	         QuizTwo q = new QuizTwo(n);  
	 }  
	 static int a = 10;  
	 static int n;  
	 int b = 5;  
	 int c;  
	 public QuizTwo(int m) {  
	       System.out.println(a + ", " + b + ", " + c + ", " + n + ", " + m);  
	   }  
	// Instance Block  
	  {  
	     b = 30;  
	     n = 20;  
	  }   
	// Static Block  
	  static   
	{  
	          a = 60;  
	     }   
	 }
     /* what will be the o/p of the following code?
	  * a. 10, 5, 0, 20, 0
	  * b. 10, 30, 20
	  * c. 60, 5, 0, 20
	  * d. 60, 30, 0, 20, 0
      *
      * Answer- 60, 30, 0, 20, 0
      */
