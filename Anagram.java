package week1.day2.assignments;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String text1="stops";
		String text2="potss";
		
		if(text1.length()==text2.length())
		{
		char[] charArray = text1.toCharArray();
		char[] charArray2 = text2.toCharArray();
		Arrays.sort(charArray);
		Arrays.sort(charArray2);

//		boolean equals2 = charArray.equals(charArray2);
//		System.out.println(equals2);
//		boolean equals = Arrays.equals(charArray,charArray2);
		if(Arrays.equals(charArray,charArray2)==true)
				{
			System.out.println(text1+" and "+text2+" are "+" ANAGRAM ");
			
				}else {
					System.out.println(" NOT A ANAGRAM");					
				}	
		
		}
	}

	}
