package javaPrograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rev = "";
		System.out.println("Enter the text");
Scanner scr = new Scanner(System.in);
String org = scr.nextLine();
int length = org.length();
for(int i = length-1;i>=0;i--)
{
	rev = rev +	org.charAt(i);
}
if(org.equals(rev))
{
	System.out.println("The given text is palindrome");
}
else
{
	System.out.println("The given text is not a palindrome");
}


	}

}
