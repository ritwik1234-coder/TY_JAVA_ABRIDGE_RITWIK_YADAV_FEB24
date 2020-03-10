package com.capgemini.quiz.day5;

public class QuizOne {
    public void myMethod()   
  {  
  System.out.println("Method");  
  }  
    
  {  
  System.out.println(" Instance Block");  
  }  
        
  public void QuizOne()  {  
  System.out.println("Constructor ");  
  }  
  static {  
      System.out.println("static block");  
  }  
  public static void main(String[] args) {  
  QuizOne c = new QuizOne();  
  c.QuizOne();  
  c.myMethod(); 
  /* what will be the execution order of the following java code if class
   * has a method, instant block, static block and constructor?
   * 
   *    a. Instance block, method, static block, and constructor
   *     b. Method, constructor, instance block, and static block
   *     c. Static block, method, instance block, and constructor
   *     d. Static block, instance block, constructor, and method
   * 
   *     Answer-  Static block, instance block, constructor, and method 
   */
  
      

}
}
