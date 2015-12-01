
public class FasterB implements BInterface {
	@Override
	public void withDraw(){
	pinNoCheck();
	checkBalance();
	System.out.println("Faster WithDraw Done...");
	
}

public void checkBalance(){
	System.out.println("Faster Balance Check...");
}

public void pinNoCheck(){
	System.out.println("Faster Pin Check");
}
}
