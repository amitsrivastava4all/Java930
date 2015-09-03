import java.util.InputMismatchException;
import java.util.Scanner;


public class Demo1 {

	
	public static void main(String[] args) {
		int firstNo = 0;
		int secondNo = 0;
		int result = 0;
		//@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the First No");
		try{
		 firstNo = scanner.nextInt();  // throw new InputMisMatchException();
		}
		catch(InputMismatchException object){
			System.out.println("First No : Only Number Allowed , U Entered Something else.."+object);
			System.out.println("Enter the First No Again ");
			scanner.nextLine();
			firstNo = scanner.nextInt();
		}
		System.out.println("Enter the Second No");
		try{
		 secondNo = scanner.nextInt();
		 
		}
		catch(InputMismatchException object){
			System.out.println("Second No: Only Number Allowed , U Entered Something else.."+object);
			System.out.println("Enter the Second No Again ");
			scanner.nextLine();
			secondNo = scanner.nextInt();
		}
		try{
		 result = firstNo/secondNo;
		}
		catch(ArithmeticException e){
			System.out.println("U Divide a No With Zero , this is not Allowed "+e);
		}
		catch(Exception e){
			System.out.println("Contact to System Admin "+e);
		}
		System.out.println("Result is "+result);
		scanner.close();

	}

}
