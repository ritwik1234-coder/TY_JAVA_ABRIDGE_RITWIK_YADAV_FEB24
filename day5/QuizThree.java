package com.capgemini.quiz.day5;

public class QuizThree {
	public static void main(String[] args) {  
	    int count = 1;  
	    while (count <= 15) {  
	    System.out.println(count % 2 == 1 ? "***" : "+++++");  
	    ++count;  
	        }      // end while  
	    }       // end main   
	 } 
   /* what will be the o/p ?
	* a.15 times ***
	* b. 15 times +++++
	* c. 8 times *** and 7 times +++++
	* d. Both will print only once
	*
	* Answer- 8 times *** and 7 times +++++
	*/


