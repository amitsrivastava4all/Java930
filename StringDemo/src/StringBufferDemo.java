
public class StringBufferDemo {

	public static void main(String[] args) {
		// Mutable
		// 16 Chars Buffer 
		//StringBuilder sb= new StringBuilder(555);  
		StringBuffer sb= new StringBuffer(555);  //1.2
		//StringBuffer sb= new StringBuffer("Hello");
		System.out.println("Len "+sb.length());
		System.out.println("Capacity "+sb.capacity());
		sb.ensureCapacity(2000);
		// if len>capacity
		// newcapacity = oldcapacity * 2 + 2
		// 44 = 21 *2 + 2
		// old array [21]
		// newarray [44]
		// if len>newcapacity
		// newcapacity= len
		sb.append("How are You I am Fine Thank u gfdhgkjfdhgkjfdhgkhdfkghkfdghkfdhkgfdkhghfdkghfdk");
		System.out.println("Len "+sb.length());
		System.out.println("Capacity "+sb.capacity());
		

	}

}
