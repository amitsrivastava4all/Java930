
public class LabeledLoops {

	public static void main(String[] args) {
		amit:  // this is the label or mark for the i loop
		for(int i = 1; i<=3; i++){
			for(int j = 1; j<=3; j++){
				if(i==j){
					break amit; // break from the i loop
					//continue amit; // skip the amit loop ( i loop) 
					// Skip the Current Loop
					//break; // exit from the Current Loop
				}
				else
				{
					System.out.println("I is "+i +" and J is "+j);
				}
			}
		}
	System.out.println("Exit from the i loop");

	}

}
