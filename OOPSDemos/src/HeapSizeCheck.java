import java.io.IOException;
import java.util.ArrayList;

// SingleTon Class
class N11
{
	// EAGER WAY
	private static N11 obj = new N11();
	// No One From Outside this class Will Not Call this Constructor
	//Lazy Way
	//private static N11 obj = null;
	public  static N11 getObject(){
		/*synchronized (N11.class) {
		if(obj==null){
			obj = new N11();
		}
		}*/
		return obj;
	}
	
	private N11(){
		
	}
}
/*class Student
{
	
}
class Emp{
	
}
Customer , Product , Account
*/

public class HeapSizeCheck {

	public static void main(String[] args) throws IOException, InterruptedException {
		// Singleton Class
		// Printer  - 
		
		/*N11 obj1 = N11.getObject();
		N11 obj2 = N11.getObject();
		N11 obj3 = N11.getObject();
		if(obj1==obj2 && obj1==obj3){
			System.out.println("Same Ref");
		}
		else
		{
			System.out.println("Not Same Ref");
		}
		Runtime runtime1 = Runtime.getRuntime();
		Runtime runtime2 = Runtime.getRuntime();
		Runtime runtime3 = Runtime.getRuntime();
		if(runtime1==runtime2 && runtime1==runtime3){
			System.out.println("Same Ref");
		}
		else
		{
			System.out.println("Not Same Ref");
		}*/
		
		Runtime r = Runtime.getRuntime();
		System.out.println(r.totalMemory());
		System.out.println(r.freeMemory());
		System.out.println(r.totalMemory()-r.freeMemory());
		r.exec("notepad");
		r.exec("calc");
		ArrayList list = new ArrayList();
		while(true){
			list.add(new HCLEmployee(10, 9090));
			Thread.sleep(30);
		}

	}

}
