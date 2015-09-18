import java.util.Arrays;
import java.util.List;


public class EvenOddNo {
static void checkEvenOdd(int i){
	if(i%2==0){
		System.out.println("Even "+i);
	}
	else
	{
		System.out.println("Odd "+i);
	}
}
	
	
	public static void main(String[] args) {
		//int x[]={10,20,30,9,1,3};
		List<Integer> x = Arrays.asList(10,20,30,9,1,3);
		// Java 8 
		x.forEach(EvenOddNo::checkEvenOdd);
		/*for(int i : x)
		{
			checkEvenOdd(i);
		}*/

	}

}
