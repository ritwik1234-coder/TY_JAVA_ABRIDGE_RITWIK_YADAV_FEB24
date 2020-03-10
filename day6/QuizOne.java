package com.capgemini.quiz.day6;

public class QuizOne {
	int id;
	String name;

	void display(){
		System.out.println(id+" "+name);
	}

	public static void main(String args[]){
	QuizOne q1=new QuizOne();
	QuizOne q2=new QuizOne();
	q1.display();
	q2.display();
     /* the following code is an example for?
      * a. Parameterized constructor
      * b. Default Constructor
      * c. Overloading Constructor
      * d. None of the above
      * 
      * Answer- Default Constructor
      */
    }
}
