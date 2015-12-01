
public class B implements BInterface {
@Override
	public void withDraw(){
	pinNoCheck();
	checkBalance();
	System.out.println("WithDraw Done...");
	
}

public void checkBalance(){
	System.out.println("Balance Check...");
}

public void pinNoCheck(){
	System.out.println("Pin Check");
}

}
