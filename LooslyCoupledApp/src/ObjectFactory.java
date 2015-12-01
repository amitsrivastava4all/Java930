import java.util.ResourceBundle;


public class ObjectFactory {
public static BInterface getObject(){
	//return new FasterB();
	BInterface obj = null;
	ResourceBundle r = ResourceBundle.getBundle("object");
	String className  = r.getString("classname");
	try {
		 obj = (BInterface)Class.forName(className).newInstance();
	} catch (InstantiationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	/*if(className.equals("B")){
		return new B();
	}
	else{
		return new FasterB();
	}*/
	return obj;
}
}
