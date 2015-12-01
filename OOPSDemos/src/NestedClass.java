class B1{
	static class B2{
		static void show(){
			System.out.println("B2 Show");
		}
	}
}
public class NestedClass {

	public static void main(String[] args) {
		B1.B2.show();

	}

}
