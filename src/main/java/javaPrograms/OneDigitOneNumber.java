package javaPrograms;

import java.util.Scanner;

public class OneDigitOneNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter the Number");
		Scanner input = new Scanner(System.in);
		int numb = input.nextInt();
		System.out.println("Enter the Digit");
		int digit = input.nextInt();
		int rem;
		int quo;
		boolean result = true;
	
		while(numb>0)
		{
			numb--;
			quo=numb;
			do
			{
				rem=quo%10;
				quo=quo/10;
				if(rem==digit)
				{
					result = false;
					break;
				}
				
			}while(quo>0);
			if(result==true)
			{
				System.out.println("The Greatest digit without "+digit+" is " +numb);
				break;
			}
			result=true;
		}
		
	}

}
