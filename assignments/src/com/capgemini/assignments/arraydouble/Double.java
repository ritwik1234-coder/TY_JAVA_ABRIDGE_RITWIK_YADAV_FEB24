package com.capgemini.assignments.arraydouble;

// Java code to demonstrate getDouble() method of Array class 
import java.util.Scanner; 
	public class Double { 
	    // main method 
		 public static void main(String[] args) 
		    { 
			 Scanner sc=new Scanner(System.in);
		       int n=sc.nextInt();
		       double d[]=new double[n];
		     
		       display(d,n);
		       for(int i=0;i<n;i++) {
		    	   System.out.println(d[i]);
		    }
		    }

		public static double[] display(double[] d,int n) {
			Scanner sc=new Scanner(System.in);
			for(int i=0;i<n;i++) {
				 d[i]=sc.nextDouble();
			}
			return d;
}
	}
	
