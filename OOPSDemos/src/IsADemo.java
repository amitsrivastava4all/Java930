// IS A Advantages
// 1. Code Reuse
// 2. Polymorphism-- Overriding is an Example of Poly.

// Overriding Rule
// No Weaker Access Scope Allowed in Overridden Method
// Allowed Covariant Return Type (Java 5) 

class X{
int a,b;
float c, d;
}
class XPlus extends X
{
	long e,f;
}
class Y
{
	
}

class Bank
{
	void deposit(){
		System.out.println("Bank Deposit Call");
	}
	void withDraw(){
		System.out.println("Bank WithDraw Call");
	}
	 X roi(){
		double a = 10.20;
		 X obj = new X();
		System.out.println("Bank ROI 6% Call");
		return obj;
	}
}
class HDFC extends Bank
{
	@Override
	public XPlus roi(){
		
		System.out.println("HDFC ROI 9 % ");
		super.roi();
		XPlus obj = new XPlus();
		return obj;
	}
	
	void offers(){
		System.out.println("HDFC Offers");
	}
}
class ICICI extends Bank
{
	@Override
	void withDraw()
	{
		System.out.println("ICICI --- More than 50,000 withDraw Need Pan Card No.");
	}
	
	void doorToDoorBanking(){
		System.out.println("ICICI Door to Door Banking...");
	}
}

class BankingOperations{
	
	// Polymorphic Method
	void operations(Bank bank){
		bank.deposit();
		bank.withDraw();
		bank.roi();
		if(bank instanceof HDFC){
			HDFC hdfc = (HDFC)bank; // Downcasting
			hdfc.offers();
		}
		else
		if(bank instanceof ICICI){	
			((ICICI)bank).doorToDoorBanking();
		}
		System.out.println("**********************");
	}
	
}
public class IsADemo {

	public static void main(String[] args) {
		//HDFC obj = new Bank();  // this is not allowed
		
		
		// Object is created for HDFC but type is Bank
		// So it will allowed only Bank type methods to execute (invoke)
		
		BankingOperations bankOperations = new BankingOperations();
		Bank bank = new HDFC();  //Upcasting
		bankOperations.operations(bank);
		bank = new ICICI();
		bankOperations.operations(bank);
		
		
		
		
		
		
		/*bank.deposit();  // First Check this is Bank, this method is
		// exist in Bank and then Check this is overridden in HDFC or not
		// if it is overridden in HDFC , then call HDFC version, otherwise
		// call Bank version
		bank.withDraw();
		bank.roi();
		//hdfc.offers();
		System.out.println("************************************");
		//ICICI icici = new ICICI();
		bank = new ICICI(); // Upcasting
		bank.deposit();
		bank.withDraw();
		bank.roi();
		//bank.doorToDoorBanking();
*/
	}

}
