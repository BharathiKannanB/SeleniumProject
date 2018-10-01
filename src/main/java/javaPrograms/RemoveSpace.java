package javaPrograms;

public class RemoveSpace {

	public static void main(String[] args) {
		String s = "aa bbbbb   ccc  d  ";
				s=s.trim();
		char[] chr = s.toCharArray();	
		int size = chr.length; int j=0;
		int temp;
		char[] nchr = new char[size];
		for(int i=0;i<size;i++)
		{
			
			if(chr[i]==' ')
			{
				
				while(chr[i]==' ')
				{
					i++;
				}
				i--;
			}
			nchr[j]=chr[i];
			System.out.print(nchr[j]);
			j++;
		}
		
	}

}
