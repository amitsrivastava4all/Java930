import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Account implements Serializable
{
	int accountNo = 19;

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + "]";
	}
	
}
class Person {
	int age;
	Person(){
		age = 21;
		System.out.println("Person Cons Call "+age);
	}
	@Override
	public String toString() {
		return "Person [age=" + age + "]";
	}
	
}

class Employee extends Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private transient double salary;
	private double bonus;
	private double pf;
	Account account = new Account(); // Has - A
	 Employee() {
		 salary = 9000;
		System.out.println("Employee Class Cons Call");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public double getPf() {
		return pf;
	}
	public void setPf(double pf) {
		this.pf = pf;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary
				+ ", bonus=" + bonus + ", pf=" + pf +super.toString()+account.toString()+ "]";
	}
	
	
	
}
public class SerializeDeserializeDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee ram = new Employee();
		ram.setId(1001);
		ram.setName("Ram");
		ram.age = 22;
		ram.setSalary(ram.getSalary()+9000.00);
		FileOutputStream fo =new FileOutputStream("D:\\MyWS-2to4\\files\\EmpData.dat");
		ObjectOutputStream os = new ObjectOutputStream(fo);
		os.writeObject(ram);
		os.close();
		fo.close();
		System.out.println("Write....");
		

	}

}
