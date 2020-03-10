package com.capgemini.quiz.day6;

public class QuizNine {
	 int num = 100; 
	    public void calc(int num)  { 
	    	this.num = num * 10;   
	    }
	    public void printNum()     { 
	    	System.out.println(num); } 
	  
	    public static void main(String[] args) 
	    { 
	        QuizNine obj = new  QuizNine(); 
	        obj.calc(2); 
	        obj.printNum();
	        /* what will be the o/p?
	         * a. 20
	         * b. 10
	         * c. 100
	         * d. 1000
	         * 
	         * Answer- 20
	         */
	    }
}
