class Outer{
	
	// It is a member of a class
	 int x;
	Outer(){
		System.out.println("Outer Class Default Cons Call");
	}
	class Inner
	{
		Inner(){
			System.out.println("Inner Class Default Cons Call");
		}
		void show(){
			System.out.println("Inner Class Show Call");
		}
	}
}
public class InnerClass {

	public static void main(String[] args) {
		// 1st Way to Access Inner Class
		Outer outer = new Outer();
		//System.out.println(outer.x);
		Outer.Inner inner = outer.new Inner();
		inner.show();
		System.out.println("****************************************");
		Outer.Inner obj = new Outer().new Inner();
		obj.show();
		System.out.println("******************************");
		new Outer().new Inner().show();
		

	}

}
