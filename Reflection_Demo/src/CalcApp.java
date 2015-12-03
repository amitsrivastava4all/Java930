import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

class Calc
{
	int add(int x , int y){
		return x + y;
	}
	int subtract(int x , int y){
		return x - y;
	}
	int multiply(int x , int y){
		return x * y;
	}
	int divide(int x , int y){
		return x / y;
	}
}
public class CalcApp {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Calc calc = new Calc();
		System.out.println("type add for Add");
		System.out.println("type subtract for subtract");
		System.out.println("type multiply for multiply");
		System.out.println("type divide for divide");
		System.out.println("Enter Choice ");
		Scanner scanner = new Scanner(System.in);
		String choice = scanner.next();
		
		Method method = calc.getClass().getDeclaredMethod(choice, int.class, int.class);
		
		Object result = method.invoke(calc, 100,200);
		System.out.println("Result "+result);
		

	}

}
