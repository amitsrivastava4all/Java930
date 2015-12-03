import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class T
{
	private int d;
	private int e;
	public int f;
	static int ee;
	final int p = 100;
	public void disp(int x){
		System.out.println("Disp "+x);
	}
	public void show(double e , double t){
		System.out.println("Show "+e+" "+t);
	}
}
public class ScanClass {

	public static void main(String[] args) {
		T obj = new T();
		Class cls = T.class;
		Field fields []= cls.getDeclaredFields();
		System.out.println("Total Fields are "+fields.length);
		
		for(Field f : fields){
			if(Modifier.isPrivate(f.getModifiers())){
				System.out.println("Private "+f.getName());
			}
		}
		
		Method methods [] = cls.getDeclaredMethods();
		for(Method m : methods){
			Class params[] = m.getParameterTypes();
			System.out.println("Method Name "+m.getName());
			for(Class p : params){
				System.out.println(p.getTypeName());
			}
			//m.invoke(obj, args)
		}
		System.out.println("Total methods are "+methods.length);
		//T obj = new T();
		//Class cls2 = obj.getClass();

	}

}
