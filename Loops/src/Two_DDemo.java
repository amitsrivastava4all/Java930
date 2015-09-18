
public class Two_DDemo {

	public static void main(String[] args) {
		int p[]={10,20,30};
		int e[]= new int[3];
		int x[][]= new int[3][4];
		int y[][] = new int[3][4];
		int []z[] = new int[3][4];
		int m[][]= new int[][]{{10,20,30},{40,50,60}}; // 2 X 3
		int k[][]= new int[3][];
		k[0]= new int[3];
		k[1]= new int[5];
		k[2]=new int[10];
		
		k[0][0]= 1000;
		
		System.out.println(k.length);
		
		for(int i = 0 ;i<k.length; i++){
			for(int j= 0 ; j<k[i].length; j++){
				System.out.println(m[i][j]);
			}
		}
		
		/*for(int i = 0 ;i<2; i++){
			for(int j= 0 ; j<3; j++){
				System.out.println(m[i][j]);
			}
		}*/
		for(int i[] : k){
			for(int j : i){
				System.out.print(j+"\t");
			}
			System.out.println();
		}
	}

}
