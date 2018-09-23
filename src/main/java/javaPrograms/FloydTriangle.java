package javaPrograms;

import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args) {
	System.out.println("Enter the now of rows");
	@SuppressWarnings("resource")
	Scanner input = new Scanner(System.in);
	int row = input.nextInt();
	int i=0;
	int temp;
	for(int j=1;j<=row;j++)
	{
		temp=j;
				do
				{
					i++;
					System.out.print(i);
					j--;
				}while(j!=0);
		j=temp;		
	    System.out.println();
	}


	}

}
