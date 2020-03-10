package com.capgemini.quiz.day6;

public class QuizTen {
	 String name; 
	  
	 QuizTen(String n) {  
		 name = n;  
		 } 
	 
	   public static void main(String[] args)  { 
	    	
		   QuizTen m1 = new QuizTen("guitar"); 
	    	QuizTen m2 = new QuizTen("tv"); 
	        System.out.println(m2.equals(m1)); 
	    } 
	  
	    @Override
	    public boolean equals(Object obj) { 
	    	
	    	QuizTen m = (QuizTen) obj; 
	        if (m.name != null){
	        	return true; 
	        	} 
	        return false; 
	        /* what will be the output of the following java code?
	         * a. true
	         * b. false
	         * c. runtime error
	         * d. non of these
	         * 
	         * Answer- true
	         */
	    }
}
