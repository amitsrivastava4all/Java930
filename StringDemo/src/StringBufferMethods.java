
public class StringBufferMethods {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("hi");
		sb.append("hello");
		sb.append(90);
		sb.insert(1, "How");  //index
		sb.deleteCharAt(0);
		sb.delete(2, 4);
		sb.reverse();
		
		System.out.println(sb);
		
		

	}

}
