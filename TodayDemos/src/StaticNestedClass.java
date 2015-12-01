class Outer{
	int x=100; 
	class Inner{
		int x=200;
		void show(int x){
			System.out.println(Outer.this.x + this.x + x);
		}
	}
}

class P {
	static class Q	{
		static int x=1000;
		static void disp(){
			System.out.println("Q Disp "+x );
		}
	}

}
public class StaticNestedClass {

	public static void main(String[] args) {
		Outer.Inner inner = new Outer().new Inner();
		inner.show(1000);
		//P.Q.disp();

	}

}
