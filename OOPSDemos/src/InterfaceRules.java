interface X1
{
	void show();
	void print();
}
interface Y1
{
	void show();
	void disp();
}
interface Z extends X1 , Y1
{
	void output();
}
class T2{
	
}
class T1 extends T2 implements X1, Y1{

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
}
class T implements Z
{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void output() {
		// TODO Auto-generated method stub
		
	}
	
}
public class InterfaceRules {

	public static void main(String[] args) {
		

	}

}
