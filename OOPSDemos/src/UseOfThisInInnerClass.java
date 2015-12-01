class A1
{
	
	interface G
	{
		
	}
	class V2 {
		
	}
	class V extends V2 implements G
	{
		
	}
	
	private int x= 100;
	class E1{
		int x = 50;
	}
	class F1{
		F1(){
			System.out.println(A1.this.x);
		}
	}
	class B1 extends E1{
		int x = 200;
		class C1{
			int x = 300;
			class D1{
				int x = 400;
				D1(int x){
					System.out.println(x + this.x + C1.this.x + B1.this.x +A1.this.x + B1.super.x  );
				}
			}
		}
	}
	
}
public class UseOfThisInInnerClass {

	public static void main(String[] args) {
		A1.B1.C1.D1 obj = new A1().new B1().new C1().new D1(1000);
	}

}
