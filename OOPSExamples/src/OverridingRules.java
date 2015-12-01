import java.io.FileNotFoundException;
import java.io.IOException;

// Weaker Access in Overridden method is not allowed
// Change the Return Type (java 5) (Covariant return type)
// Exception Rule
class E
{
	int x,y;
}
class EPlus extends E{
	int z;
}
class A
{
	 E show() throws ArithmeticException{
		 E obj = new E();
		 obj.x = 100;
		 obj.y = 200;
		System.out.println("A Show Call");
		return obj;
	}
}
class B extends A
{
	@Override
	 public EPlus show() throws RuntimeException{
		EPlus obj = new EPlus();
		obj.x = 100;
		obj.y = 200;
		obj.z = 300;
		System.out.println("B SHow Call");
		return obj;
	}
}

public class OverridingRules {

	public static void main(String[] args) {
		B obj = new B();
		obj.show();

	}

}
