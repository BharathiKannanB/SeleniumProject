package javaPrograms;

import java.util.Scanner;

public class SumOfMultOf3And5 {

	public static void main(String[] args) {
		System.out.println("Enter the Value");
		Scanner input = new Scanner(System.in);
		int value = input.nextInt();
		int sum=0;
		for(int i=value-1;i>0;i--)
		{
			if(i%3==0|| i%5==0)
			{
				sum=sum+i;
			}
		}
		System.out.println("Sum of all multiples of 3 and 5 less than "+ value +" is "+ sum);
	}

}
