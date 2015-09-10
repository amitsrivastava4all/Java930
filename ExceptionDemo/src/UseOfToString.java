
class Customer //extends Object
{
	private int id;
	private String name;
	
	Customer(int id , String name){
		this.id = id ;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
	
	

}

public class UseOfToString {

	public static void main(String[] args) {
		//System.out.printf(format, args)
		Customer ram = new Customer(1001,"Ram");
		System.out.println(ram.toString());
		String x = new String("Hello");
		System.out.println(x.toString());

	}

}
