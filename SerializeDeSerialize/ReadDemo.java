import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class ReadDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fi = new FileInputStream("D:\\MyWS-2to4\\files\\EmpData.dat");
		ObjectInputStream oi = new ObjectInputStream(fi);
		Employee x = (Employee)oi.readObject();
		System.out.println(x);
		oi.close();
		fi.close();

	}

}
