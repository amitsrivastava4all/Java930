// Is a Parent Class and having the common feature of Loan
abstract class Account{
	
}
abstract class Loan extends Account
{
	int accountNo;
	double amount;
	String name;
	String address;
	void applyForLoan(){
		System.out.println("Common Apply For Loan");
	}
	abstract void roi();
	abstract void tenure();
}
class HomeLoan extends Loan
{
	// ROI will be 10%
	@Override
	void roi(){
		System.out.println("ROI is Low...");
	}
	@Override
	void tenure(){
		System.out.println("5 Years 10 Year 20 Years 30 Years 35 Years");
	}
}
class AutoLoan extends Loan
{
	@Override
	void roi(){
		System.out.println("ROI is Some How High");
	}
	@Override
	void tenure(){
		System.out.println("3 Years 5 Years 7 Years");
	}
}
class PersonLoan extends Loan
{
	@Override
	void roi(){
		System.out.println("ROI is  Very High");
	}
	@Override
	void tenure(){
		System.out.println("6 Months 1 Year 3 Years 5 Years");
	}
}

class LoanFactory
{
	public void loanDetails(Loan loan){
		loan.applyForLoan();
		loan.roi();
		loan.tenure();
	}
}

public class AbstractDemo {
	
	public void loanDetails(Loan loan){
		loan.roi();
		loan.tenure();
	}

	public static void main(String[] args) {
		LoanFactory loanFactory = new LoanFactory();
		/*Loan loan = new HomeLoan();  //Upcasting
		ab.loanDetails(loan);*/
		loanFactory.loanDetails(new HomeLoan());
		loanFactory.loanDetails(new AutoLoan());
		
				
		/*HomeLoan homeLoan = new HomeLoan();
		homeLoan.roi();
		homeLoan.tenure();
		
		AutoLoan autoLoan = new AutoLoan();
		autoLoan.roi();
		autoLoan.tenure();*/
		//Loan tenYear2 = new Loan();
			
	}

}
