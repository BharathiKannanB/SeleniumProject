package javaPrograms;

public class SwapTwoStrings {

	public static void main(String[] args) {
		String s1 = "test";
		String s2 = "leaf";
	
		s1 = s1.concat(" "+s2);
		
		s2 = s1.substring(0, s1.length()-s2.length());
		
		System.out.println(s2);
		
		s1 = s1.substring(s2.length());
		
		System.out.println(s1);
		
	//	s2 = s1.substring(0, endIndex)
		
	}

}
