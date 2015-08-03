class N
{
	int a ;
	N(){
		//this(90);
		 a= 100;
		System.out.println("N Default Call");
	}
	N(int x){
		this();
		System.out.println("N Param Call");
	}
}
public class ParamConsDemo {

	public static void main(String[] args) {
		N obj1 = new N(90);
		N obj2 = new N(190);

	}

}
