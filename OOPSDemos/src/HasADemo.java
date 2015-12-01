class ITStudent{
	int rollno;
	String name;
	Course course;
	ITStudent(){
		System.out.println("Student Created...");
		// When Student Object is Created then the Course Object is Created..
		course = new Course(); // Composition
	}
	// When Student is Created then Course is Assign 
	ITStudent(Course course){
		System.out.println("Student Created and Course Assign");
		this.course = course;
	}
	@Override
	protected void finalize(){
		System.out.println("Student Gone...");
	}
}
class Course{
	String courseDetails;
	int duration;
	Course(){
		System.out.println("Course Created....");
	}
	@Override
	protected void finalize(){
		System.out.println("Course Gone...");
	}
}
public class HasADemo {
public static void main(String[] args) {
		// Composition
		ITStudent shyam =new ITStudent();
		shyam = null;
		System.gc();
		
		
		// Aggegration
		Course course = new Course();
		ITStudent ram = new ITStudent(course);
		ram = null;
		System.gc();  // Request to the Garbage Collector to collect the Object

	}

}
