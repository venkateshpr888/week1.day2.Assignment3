package week1.day2.assignments;

public class ReverseEvenWords {
public static void main(String[] args) {
	String test = "I am a software tester";
	String[] split = test.split(" ");
	System.out.println("   ReversedEvenWord  ");
	for (int i = 0; i < split.length; i++) {
		if (i%2!=0) {
			//String split1=split[i];//reduced memory 
			for (int j =split[i].length()-1; j >=0 ; j--) {
			System.out.print(split[i].charAt(j));//printing particular character
			}
			System.out.print(" ");
			}
			else 
			{
				System.out.print(split[i]);
				}
		System.out.print(" ");
			
		}
		
	}
}

