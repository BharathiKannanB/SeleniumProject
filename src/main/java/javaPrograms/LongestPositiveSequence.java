package javaPrograms;

public class LongestPositiveSequence {

	public static void main(String[] args) {
		int[] arr = { -1, 2, -3, -4, 5, 6, 7, -8, 9, 10};
		int temp=0; 
		int seq=0;
		int[] pos= new int[arr.length];
		for(int value:arr)
		{
			if(value>0)
			{
				temp++;
				if(temp>=seq)
				{
				seq=temp;
				//System.out.print(seq+" "+value);
				pos[temp-1]=value;
				
				}
			}
			else {
			temp=0;
		}
	}
		System.out.println("Longest Positive Sequence Length: "+seq);
		System.out.print("Sequence:");
		for(int i:pos)
		{
			if(i!=0)
			System.out.print(i+" ");
			
		}

}
}
