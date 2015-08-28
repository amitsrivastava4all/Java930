
public class Demo1 {

	public static void main(String[] args) {
		// It is a Class , JDK 1.0
		// It is also Known as Data Type
		// Internally it is a char []
		// final class
		// It used String Pool
		// It is Immutable class
		String a = "Hello";  // 1 or 0  (Internally it call "Hello".intern()
		String b = "Hello";
		String c = new String("Hello");  // 2 or 1
		if(a==b){
			System.out.println("Same Ref");
		}
		else
		{
			System.out.println("Not Same Ref");
		}
		a = "bye";
		if(a==b){
			System.out.println("Same Ref");
		}
		else
		{
			System.out.println("Not Same Ref");
		}

	}

}
