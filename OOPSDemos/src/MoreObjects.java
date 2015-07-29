import java.util.ArrayList;


public class MoreObjects {

	public static void main(String[] args) throws InterruptedException {
		ArrayList list = new ArrayList(1000);
		System.out.println("Program Starts");
		while(true){
			Student ram = new Student(1001, "Ram", 3, "BTECH");
			list.add(ram);
			//Thread.sleep(20);
		}

	}

}
