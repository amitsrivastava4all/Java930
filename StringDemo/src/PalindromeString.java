import java.util.Scanner;


public class PalindromeString {

	public static void main(String[] args) {
		
		/*StringBuffer sb = new StringBuffer("hello");
		StringBuffer sb2 = new StringBuffer("hello");
		if(sb.toString().equals(sb2.toString())){
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}*/
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String ");
		String value = scanner.nextLine();
		StringBuffer org = new StringBuffer(value);
		//StringBuffer sb2 = org.reverse();
		StringBuffer dup = new StringBuffer(value);
		dup.reverse();
		if(org.toString().equals(dup.toString())){
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not");
		}

	}

}
