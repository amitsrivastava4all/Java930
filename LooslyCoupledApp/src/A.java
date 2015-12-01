
public class A {

	public static void main(String[] args) {
		/*BInterface obj = new B();
		obj.withDraw();*/
		BInterface obj = ObjectFactory.getObject();
		obj.withDraw();
		/*obj.checkBalance();
		obj.pinNoCheck();*/

	}

}
