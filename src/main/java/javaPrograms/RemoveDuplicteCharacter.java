package javaPrograms;

import java.util.Scanner;

public class RemoveDuplicteCharacter {

	public static void main(String[] args) {
	/*Scanner input = new Scanner(System.in);
	String text = input.nextLine();*/
		String text = "Good Morning India";
	text = text.replaceAll("\\s", "");
	System.out.println(text);
	text = text.toLowerCase();
	System.out.println(text);
	char[] ctext = text.toCharArray();
	char[] ntext = null;
	String text1;
	int val=0;
	int size = ctext.length;
	for(int i=0; i<size; i++)
	{
		for(int j=0; j<i; j++ )
		{
			if(ctext[i]==ctext[j])
			{
			break;	
			}
			
		}
		val++;
		ntext[val] = ctext[i];
				
		}
		
	System.out.println(ntext);		
	}
		
	}




