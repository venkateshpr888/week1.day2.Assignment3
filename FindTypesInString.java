package week1.day2.assignments;

public class FindTypesInString {
public static void main(String[] args) {
	String test = "$$ Welcome to 2nd Class of Automation $$ ";
	int  letter1 =0,space1 = 0, num1 = 0, specialChar = 0;
	char[] charArray = test.toCharArray();
	for (int i = 0; i < charArray.length; i++) {
		//System.out.println(charArray[i]);
		boolean letter = Character.isLetter(charArray[i]);
		boolean digit = Character.isDigit(charArray[i]);
		boolean spaceChar = Character.isSpaceChar(charArray[i]);
	if (letter==true) {
		System.out.println(charArray[i]+"= It is a Letter");
		letter1++;
	}else if(digit==true) {
		System.out.println(charArray[i]+"= It is a Digit");
		num1++;
	} else if(spaceChar==true) {
		System.out.println(charArray[i]+"= It is a Space");
		space1++;
		
	}else {System.out.println(charArray[i]+"=It is a special character");
	specialChar++;
	}
	}
	System.out.println("number of  letter = " +letter1);
	System.out.println("number of  digit = " +num1);
	System.out.println("number of  Space = " +space1);
	System.out.println("number of  special character = "+specialChar);
}
}
