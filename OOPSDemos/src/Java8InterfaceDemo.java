import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;

interface W1
{
	public default void show(){
		System.out.println("W1 Show ");
	}
	public default void print(){
		System.out.println("W1 Print");
	}
	
}
interface W2
{
	public default void show(){
		System.out.println("W2 Show ");
	}
}
class W3 implements W1, W2
{
	@Override
	public  void show(){
		W1.super.show();
		W2.super.show();
	}
}
public class Java8InterfaceDemo {

	public static void main(String[] args) {
		WindowListener l;
		WindowAdapter w;

	}

}
