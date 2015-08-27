import java.lang.instrument.Instrumentation;

// Formula - Every Class has 8 Bytes reserverd for House Keeping things
// a) Is Object Eligable for GC.
// b) Is Object is Locked by Another Object
// + Add Primitive Data Type Size + Add Ref Data Type Size
// + Add Padding Bytes
class PP{
	
}
class HH{
	int s;  // 8 + 4 + 4 (Padding Bytes)
}
class NN{
	String m;  // 8 + 4 (Ref) + 4 (Padding Bytes)
}
class MM{
	String a;    // 4 
	int b; // 4 
	double d; // 8 + 8
}
public class ObjectSizeCheck {
	// 1.6
	public static void premain(String a, Instrumentation ins){
		System.out.println("PreMain Start");
		PP obj = new PP();
		long size = ins.getObjectSize(obj);
		System.out.println("PP Size "+size);
		size = ins.getObjectSize(new HH());
		System.out.println("HH Size "+size);
		size = ins.getObjectSize(new NN());
		System.out.println("NN Size "+size);
		size = ins.getObjectSize(new MM());
		System.out.println("MM Size "+size);
	}
	
	public static void main(String[] args) {
		System.out.println("Main Start....");

	}

}
