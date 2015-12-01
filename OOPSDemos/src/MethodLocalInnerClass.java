class K
{
	int w = 1000;
	void show(){
		int e = 100;  // Local var
		class M{
			void disp(){
				w++;
				//e++;
				System.out.println("M Disp Call "+w);
			}
		}
		M obj = new M();
		obj.disp();
		e++;
	}
}
public class MethodLocalInnerClass {

	public static void main(String[] args) {
		K obj = new K();
		obj.show();

	}

}
