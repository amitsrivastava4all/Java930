import java.util.Arrays;


public class InterviewQuestion {

	public static void main(String[] args) {
		String s = "Hello How are you I am Fine thank u";
		String e [] = s.split(" ");
		System.out.println("No of Words "+e.length);
		int highestCount = 0;
		char highestCountChar = '#';
		String str = "abeweabfhjjcuxyklhzuktdhgwkmsfbsdrep";
		char array[] = str.toCharArray();
		Arrays.sort(array);
		String sortedString = new String(array);
		/*for(char s : array){
			System.out.print(s);
		}*/
		System.out.println("Sorted "+sortedString);
		for(int i = 0 ; i<sortedString.length();){
			char singleChar = sortedString.charAt(i);
			int startIndex = sortedString.indexOf(singleChar);
			int lastIndex = sortedString.lastIndexOf(singleChar);
			int count = lastIndex - startIndex;
			if(count ==0){
				System.out.print(singleChar);
			}
			if(count>=highestCount){
				highestCount = count;
				highestCountChar = singleChar;
			}
			i = lastIndex + 1;
		}
		System.out.println("\n"+highestCount+" "+highestCountChar);

	}

}
