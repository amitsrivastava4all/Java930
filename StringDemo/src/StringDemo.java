
public class StringDemo {

	public static void main(String[] args) {
		Integer x = 100;
		String y = x.toString();
		y = y + 200;
		System.out.println(y);
		String data = "Space";
		//StringBuffer data = new StringBuffer("Space");
		for(int i = 0 ; i<data.length(); i++){
			char singleChar = data.charAt(0);
			data = data.substring(1)+ singleChar;
			//data.deleteCharAt(0);
			//data.append(singleChar);
			System.out.println(data);
		}
	}

}
