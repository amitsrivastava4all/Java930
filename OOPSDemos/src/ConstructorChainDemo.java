class A
{
	int x ;
	//A(){}
	A(){
		 x = 100;
		System.out.println("A Class Default Cons Call "+x);
	}
	A(int x){
		this();
		System.out.println("A Class Param Cons Call");
	}
}
class B extends A
{
	int y;
	B(){
		super(67); // This will Call parent class default cons
		y = x + 200;
		System.out.println("B Class Default Cons "+y);
	}
	B(int x){
		this();
		//super(900);
		//super();
		System.out.println("B Class Param Cons Call");
	}
}
public class ConstructorChainDemo {

	public static void main(String[] args) {
		B obj = new B(200);

	}

}
