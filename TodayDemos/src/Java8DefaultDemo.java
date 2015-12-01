interface A{
	default void show(){ 
		System.out.println("A Show Call");
	}
}
interface B
{
	default void show(){
		System.out.println("B Show Call");
	}
}
interface C extends A,B
{
	@Override
	public default void show(){
		A.super.show();
		B.super.show();
	}
}
class D implements C
{
	
}
public class Java8DefaultDemo {

	public static void main(String[] args) {
		D obj = new D();
		obj.show();

	}

}
