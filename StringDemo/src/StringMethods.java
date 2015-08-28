
public class StringMethods {

	public static void main(String[] args) {
		String a ="Hello";
		String  b = new String("Hello");
		System.out.println("Len "+a.length());
		a = a.toUpperCase();
		//System.out.println("UpperCase "+a.toUpperCase());
		System.out.println("Lower Case "+a.toLowerCase());
		System.out.println("A is "+a);
		char y = a.charAt(0);
		System.out.println("CharAt 0 Index "+y);
		System.out.println(a.compareToIgnoreCase("Bye"));  //pos , neg , 0
		System.out.println(a.equals("Hello"));
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a.concat("Bye").concat("Ok").concat("Fine"));
		System.out.println(a+"Bye"+"Ok"+"Fine");
		System.out.println(a.contains("el"));
		System.out.println(a.indexOf("L"));
		System.out.println(a.lastIndexOf("L"));
		a= "Mr Ram Kumar";
		System.out.println(a.startsWith("Mr"));
		System.out.println(a.endsWith("Kumar"));
		System.out.println(a.replace('a', 'b'));
		a = "Hello";
		System.out.println(a.substring(2));
		System.out.println(a.substring(2,4));
		a ="         Amit     Srivastava      ";
		System.out.println("WithOut Trim ["+a+"]");
		System.out.println("With Trim ["+a.trim()+"]");
		String address = "A-1, Shakti nagar, Delhi-7";
		String array[] = address.split(",");
		for(String z : array){
			System.out.println(z);
		}
		byte f[]=a.getBytes();
		char r[] = a.toCharArray();
		
		
		
		

	}

}
