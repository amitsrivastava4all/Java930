import java.util.LinkedList;


public class AutoBoxingDemo {

	public static void main(String[] args) {
		/*int x = 100;
		int y = 200;
		Integer i = new Integer(x); //Boxing (Primitive to Object)
		Integer j = new Integer(y);
		//int z = i.intValue(); // UnBoxing (Object to Primitive)
		int z = i.intValue() + j.intValue();
		Integer k = new Integer(z);
		LinkedList l =new LinkedList();
		l.add(i);*/
		int x = 100;
		Integer i = x;
		Integer y = 200;
		Integer z = x + y;
		System.out.println(z);
		LinkedList<Integer> l = new LinkedList();
		l.add(x);
		

	}

}
