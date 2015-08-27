class V1
{
	// Pass By Value
	static void increment(int x, int y){
		x++;
		y++;
		System.out.println("X is "+x+" and Y is "+y);
	}
}

class ComputeSalary
{
	static void computerSalary(HCLEmployee obj){
		obj.hra = obj.salary * 0.30;
		obj.da = obj.salary * 0.20;
		obj.ta = obj.salary * 0.10;
		
	}
	static void printSalary(HCLEmployee obj){
		System.out.println("Id "+obj.id);
		System.out.println("Salary "+obj.salary);
		System.out.println("HRA "+obj.hra);
		System.out.println("DA "+obj.da);
		System.out.println("TA "+obj.ta );
	}
}

class HCLEmployee{
	int id;
double salary;
double hra;
double ta;
double da;
HCLEmployee(int id , double salary){
	this.id = id;
	this.salary = salary;
}
}

public class PassByValuePassByRef {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		V1.increment(a, b);
		System.out.println("A is "+a+" and B is "+b);
		HCLEmployee ram = new HCLEmployee(1001, 9000);
		ComputeSalary.computerSalary(ram);
		ComputeSalary.printSalary(ram);
	}

}
