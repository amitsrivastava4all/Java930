@FunctionalInterface
interface Calc{
	public void calcEmi();  // public abstract void calcEmi();
}
class HomeLoan implements Calc{
	@Override
	public void calcEmi(){
		System.out.println("Home Loan Emi Calc....");
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// 1st Way
		HomeLoan loan = new HomeLoan();
		loan.calcEmi();
		
		// 2nd Way
		// Define an Anonymous Class (It is without name class and it
		// implement the interface Calc
		Calc obj = new Calc(){
			@Override
			public void calcEmi(){
				System.out.println("Anonymous Class Emi Call..");
			}
		};
		obj.calcEmi();
		
		// 3rd Way
		Calc obj2 = ()->System.out.println("Lambda Class Emi Call...");
		obj2.calcEmi();

	}

}
