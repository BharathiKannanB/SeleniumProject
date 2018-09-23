package javaPrograms;

import java.util.Scanner;

public class FourXFourMatrix {

	public static void main(String[] args) {
		
		System.out.println("Enter the value");
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int value = 0;
		int value2 = 0;
		while(value<size)
		{
			for(int i=0;i<=3;i++)
			{
				if(value<size)
				{
					value++;
				}
				else
				{
					break;
				}
				System.out.print(value+"  ");
				
			}
			System.out.println();
		}
		while(value2<size)
		{
			value2++;
			System.out.print(value2+" ");
		}

	}

}
