import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ScannerUse {

	public static void main(String[] args) throws FileNotFoundException {
		//Scanner scanner  = new Scanner(System.in);
		
		Scanner s = new Scanner(new File("D:\\MyWS-2to4\\Java930\\StringDemo\\src\\ScannerUse.java"));
		s.useDelimiter("\n");
		//Scanner scanner  = new Scanner("Hello how are you");
		while(s.hasNext()==true){
			System.out.println(s.next());
		}
		

	}

}
