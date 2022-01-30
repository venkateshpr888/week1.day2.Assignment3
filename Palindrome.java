package week1.day2.assignments;

public class Palindrome {
	public static void main(String[] args) {
		String valve="madam";
		String revValve="";
		for (int i =valve.length()-1; i>=0; i--) {
		revValve=revValve+valve.charAt(i);
			System.out.println(revValve);
			}
		if(valve.equals(revValve))
		{System.out.println("It is Palindrome");
		}
		else {		
			System.out.println("It is Not a Palindrome");
			}
	}

}
