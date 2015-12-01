import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;


public class AddDemo {

	public static void main(String[] args) {
		System.out.println("Type 1 for English");
		System.out.println("हिंदी के लिए २ दबाये ");
		System.out.println("Per stampa italiana 3");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		Locale locale = null;
		if(choice==1){
			locale = new Locale("en","US");
		}
		else
			if(choice==2){
				locale = new Locale("hi","IN");
			}
			else
				if(choice==3){
					locale = new Locale("it","IT");
				}
		ResourceBundle rb = ResourceBundle.getBundle("message",locale);
		System.out.println(rb.getString("firstno"));
		int firstno = scanner.nextInt();
		System.out.println(rb.getString("secondno"));
		int secondno = scanner.nextInt();
		int result = firstno + secondno;
		NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
		System.out.println(rb.getString("result") + nf.format(result));

	}

}
