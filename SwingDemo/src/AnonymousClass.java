interface A
{
	void show();
}
class B implements A
{
	@Override
	public void show(){
		System.out.println("B Show");
	}
}
public class AnonymousClass {

	public static void main(String[] args) {
		A obj = new A(){
			@Override
			public void show(){
				System.out.println("B Show");
			}
		};
		obj.show();
	}

}
