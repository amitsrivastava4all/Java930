import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;


public class IPAddressDemo {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress local = InetAddress.getLocalHost();
		System.out.println(local.getHostName());
		System.out.println(local.getHostAddress());
		System.out.println("Enter the Host Name");
		Scanner scanner = new Scanner(System.in);
		String hostName = scanner.next();
		InetAddress address[] = InetAddress.getAllByName(hostName);
		for(InetAddress i : address){
			System.out.println(i.getHostAddress());
		}

	}

}
