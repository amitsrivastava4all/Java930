
class N1
{
	void show(){
		System.out.println("N Show Call");
	}
}
class N2 extends N1{
	@Override
	void show(){
		System.out.println("N2 Show Call");
	}
}

interface R
{
	void show();
}
@FunctionalInterface   // SAM (Single Abstract Method)
interface W
{
	int add(int x,int y);
	//int sub(int x,int y);
}
// 1st way to implement interface
class R1 implements R
{
	public void show(){
		System.out.println("R1 Show");
	}
}
public class InterfaceAndClassUseWay {
	void create(){
		if(100>20){
			// class ____ implements R{}
			// override
			// object create and upcasting
			// 2nd way to implement interface
			R obj = new R(){
				@Override
				public void show(){
					System.out.println("R Show");
				}
			};
			obj.show();
			//R1 obj = new R1();
		}
	}
	public static void main(String[] args) {
		InterfaceAndClassUseWay obj = new InterfaceAndClassUseWay();
		obj.create();
		//R1 obj = new R1();
		
		// 3rd Way (Lambda) + (SAM Interface)
		R obj2 = ()->System.out.println("R Show Call Again");
		W obj3 = (x,y)->x+y;  // return x + y;
		
		R obj6 = ()->{
			System.out.println("Multi Line");
			System.out.println("Multi Line");
			System.out.println("Multi Line");
		};
		obj6.show();
		
		R obj7 = new R1();
		obj7.show();
		
		System.out.println(obj3.add(90, 100));
		
		N1 obj4 = new N1(){
			@Override
			public void show(){
				System.out.println("N1 Show");
			}
		};
		
		//N1 obj5 = ()->System.out.println("Lambda Show ");

	}

}
