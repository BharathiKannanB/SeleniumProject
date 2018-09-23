package javaPrograms;

import java.util.Scanner;

public class SecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner get = new Scanner(System.in);
     System.out.println("Enter First Number");
     int a = get.nextInt();
     System.out.println("Enter Second Number");
     int b = get.nextInt();
     System.out.println("Enter Third Number");
     int c = get.nextInt();
     if((a<b && a<c) || (a>b && a>c))
     {
    	 if(b<c)
    	 {
    		  System.out.println("Second smallest number "+ b);
    	 }
    	 else
    	 {
    		 System.out.println("Second smallest number " + c);
    	 }
     }
     else
     System.out.println("Second smallest number " +a);
   

	}

}
