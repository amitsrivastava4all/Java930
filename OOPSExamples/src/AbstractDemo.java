abstract class Account
{
	int accountNo;
	double balance;
	void deposit(){
		System.out.println("Account Class Deposit Call");
	}
	void withDraw(){
		System.out.println("Account Class withDraw Call");
	}
	abstract void roi();
}
class SavingAccount extends Account{
	@Override
	void deposit(){
		super.deposit();
		System.out.println("If Amount More than 1 lakh then show pan card");
		
	}
	@Override
	public void roi(){
		System.out.println("this is Saving Account ROI 10% , u will get it");
	}
}
class CurrentAccount extends Account{
	@Override
	public void roi(){
		System.out.println("this is Current Account ROI 12% , u will pay it");
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		SavingAccount sa = new SavingAccount();
		sa.deposit();
		sa.withDraw();
		sa.roi();

	}

}
