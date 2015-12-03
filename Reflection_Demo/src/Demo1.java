import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

class A
{
	void print(){
		System.out.println("A Print....");
	}
	A(){
		System.out.println("A Class Cons Call");
	}
	static{
		System.out.println("A Class Loaded...");
	}
}
class B
{
	void show(){
		System.out.println("B Show");
	}
	static{
		System.out.println("B Class Loaded...");
	}
	B(){
		System.out.println("B Class Cons Call");
	}
}
class C
{
	void disp(){
		System.out.println("C Disp");
	}
	C(){
		System.out.println("C Class Cons Call");
	}
	static{
		System.out.println("C Class Loaded...");
	}
}
public class Demo1 {

	public static void main(String[] args) {
		//E e = new E();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Class Name");
		String className = scanner.next();
		System.out.println("Enter the method name");
		String methodName = scanner.next();
		try {
			try {
				Object o = Class.forName(className).newInstance();
				try {
					Method method = o.getClass().getDeclaredMethod(methodName, null);
					try {
						method.invoke(o, null);
					} catch (IllegalArgumentException
							| InvocationTargetException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} catch (NoSuchMethodException | SecurityException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
