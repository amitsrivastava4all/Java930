




/*interface Animal{
void eat();
void walk();
void sound();
void roam();
}
abstract class CommonFeatureOfAnimal implements Animal {
public void roam(){
System.out.println("Yes All Animals Roam ... ");
}
}
class Lion extends CommonFeatureOfAnimal
{
}*/
interface Animal{
	void eat();
	void sound();
}
interface Pet{
	void givePetName(String petName);
}
abstract class CommonFeatureOfAnimal{
	public void roam(){
		System.out.println("Yes All Animals Roam ... ");
		}
	
	
}
class Lion extends CommonFeatureOfAnimal implements Animal
{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		
	}
	
}
class Cat extends CommonFeatureOfAnimal implements Animal, Pet{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void givePetName(String petName) {
		// TODO Auto-generated method stub
		
	}
	
}
class Cow extends CommonFeatureOfAnimal implements Animal,Pet
{

	@Override
	public void givePetName(String petName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
