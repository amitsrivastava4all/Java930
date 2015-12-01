class Loan
{
	/*Loan(){
		System.out.println("Loan Class Default Cons");
	}*/
	Loan(int x){
		System.out.println("Loan Class Param Cons");
	}
	void emi(){
		System.out.println("Loan EMI 10%");
	}
	
}
class HomeLoan extends Loan
{
	HomeLoan(){
		super(9000);
		System.out.println("HomeLoan Default Cons");
	}
	HomeLoan(int x){
		super(1000);
		System.out.println("HomeLoan Class Param Cons");
	}
	@Override
	void emi(){
		super.emi();
		System.out.println("Loan EMI 14%");
	}
}
public class OverrideDemo {

	public static void main(String[] args) {
		HomeLoan loan = new HomeLoan(10);
		loan.emi();

	}

}
