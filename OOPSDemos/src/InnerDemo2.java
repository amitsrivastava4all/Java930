class Employee
{
	private String name;
	Employee(String name){
		this.name =name;
		System.out.println(" Welcome Employee "+name);
		BankAccount account =new BankAccount();
		MemberShipCard card = new MemberShipCard();
		Cab cab = new Cab();
	}
	protected void finalize(){
		System.out.println("Employee Gone "+name);
	}
	class BankAccount
	{
		BankAccount(){
			System.out.println("Account Open for "+name);
		}
		protected void finalize(){
			System.out.println("Bank Account Gone "+name);
		}
	}
	class MemberShipCard{
		 MemberShipCard() {
			System.out.println("MemberShip Card Created for "+name);
		}
		 protected void finalize(){
				System.out.println("MemberShip Gone "+name);
			}
	}
	class Cab{
		Cab(){
			System.out.println("Cab Facility for "+name);
		}
		protected void finalize(){
			System.out.println("Cab Faclity Gone "+name);
		}
	}
}
public class InnerDemo2 {

	public static void main(String[] args) {
		Employee ram = new Employee("Ram");
		ram = null;
		System.gc();
		System.out.println("****************************************8");
		Employee shyam = new Employee("Shyam");
		

	}

}
