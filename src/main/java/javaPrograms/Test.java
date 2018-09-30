package javaPrograms;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -1, 2, -3, -4, 5, 6, 7, -8, 9, 10};
		int posarr[]= new int[10]; int i=0;
		for(int value:arr)
		{
			posarr[i] =value;
					i++;
		}
		System.out.println(posarr);
	}

}
