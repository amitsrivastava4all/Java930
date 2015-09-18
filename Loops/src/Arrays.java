
public class Arrays {

	public static void main(String[] args) {
		int x = 10;
		int y[] = {10,20,30}; // One - D Array
		int z[] = new int[20];
		int a[]= new int[]{90,34,55,22};
		int []b = new int[5];
		// Old way to Traverse the Loop
		/*for(int i = 0 ; i<z.length; i++){
			System.out.println(z[i]);
		}*/
		//System.out.println("Array Length is "+z.length);
		// New Way Java 5 (Enhance For Loop)
		for(int i : a){
			System.out.println(i);
		}

	}

}
