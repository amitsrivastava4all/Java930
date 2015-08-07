//Why we create abstract class
// Interface  - Prototype Design
// Game Design
// Actors - Player , Attacker
// what to do
// 100 % Abstract Java 7
interface Player
{
	int MAXJUMP = 100; // public static final int MAXJUMP = 100;
	int DEFAULTJUMP = 10;
	int MAXRUN = 100;
	int DEFAULT_RUN=20; 
	void run(int runValue);  // public abstract void run(int runValue)  
	void jump(int jumpValue);
	void attack(int force);
	void defense();
	int powerIncrement();
	
}
interface SuperPlayer //extends Player
{
	void injections();
}

// How to do
class RedPlayer implements Player, SuperPlayer
{
int speed = DEFAULT_RUN;
	@Override
	public void injections() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run(int runValue) {
		if(speed<MAXRUN){
			speed++;
		}
		System.out.println("Red Player Run Very Fast...");
		
	}

	@Override
	public void jump(int jumpValue) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack(int force) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void defense() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int powerIncrement() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
class YellowPlayer implements Player
{

	@Override
	public void run(int runValue) {
		System.out.println("Red Player Run  Fast...");
		
	}

	@Override
	public void jump(int jumpValue) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack(int force) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void defense() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int powerIncrement() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
class GreenPlayer implements SuperPlayer{

	@Override
	public void injections() {
		// TODO Auto-generated method stub
		
	}
	
}
public class InterfaceDemo {
	void commonPlayer(Player player){
		player.run(10);
		player.jump(10);
		player.attack(20);
		player.defense();
		player.powerIncrement();
	}
	public static void main(String[] args) {
		//LinkedList 
		InterfaceDemo obj = new InterfaceDemo();
		obj.commonPlayer(new RedPlayer());
		obj.commonPlayer(new YellowPlayer());
		//obj.commonPlayer(new GreenPlayer());
		

	}

}
