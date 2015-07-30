//Functionality
public class Student  {
	private int rollno;  // It is a Member of a class
	private String name;  // Instance Variables
	private int duration;
	private String course; // Data must be protected from outside world
	private String phone;
	private String pinCode;
	private String city;
	private String collegeName;
	//Student(){}
	/*
	 * Constructor is used to initalize the Instance Variables
	 * It is call automatically when u create an object
	 * Constructor Name is same as Class Name
	 * Constructor returns Nothing
	 * Every Class has default constructor by default
	 * If u create any Constructor the Default Constructor is Kill 
	 */
	Student(){
		//this(1001, "Ram", 3, "BTECH", "2222", "Delhi", "110007");
	System.out.println("Student class default cons call");	
	collegeName = "SRCC";
	}
	
	//Primary Fields (Mandatory Fields)
	// this is the Param Cons (it is an Example of Constructor overloading
	Student(int rollno, String name, int duration , String course){
		// this() - Constructor Call and it has to be the first line
		//this(); // this will call Default Cons of the same class
		this();
		this.rollno = rollno;
		this.name = name;
		this.duration = duration;
		this.course = course;
		
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public int getRollno() {
		return rollno;
	}
	
	public double calculatePercentage(){
		return 0;
	}
	
	public String getGrade(){
		return "";
	}
	
	@Override
	public int hashCode(){
		return 100;
	}
	
	// Secondary Fields + Limited Access for Print
	
	
	// TakeInput method is used to initalize the Instance variables
	/*public void takeInput(int rollno, String name ,int duration , String  course, String phone, String pinCode , String city){
	 if(rollno>0 && duration>0){
		this.rollno = rollno;
	 this.name = name;
	 this.duration = duration;
	 this.course = course;
	 this.phone = phone;
	 this.pinCode =pinCode;
	 this.city = city;
	 }
	 else
	 {
		 System.out.println("Invalid Data....");
	 }
	}
*/
	
	// Data Must be access using methods
	
	// Instance Methods
	/*public void print(){
		// this--> It is a keyword , which hold the current object reference  
		// in main we call ram.print --> so ram store in this keyword
		// same thing for shyam  
		//System.out.println("This is "+this);
		System.out.println("Rollno "+this.rollno);  // 6789.rollno
		System.out.println("Name "+name);
		System.out.println("Course "+course);
		System.out.println("Duration "+duration);
		System.out.println("Phone "+phone);
		System.out.println("PinCode "+pinCode);
		System.out.println("CollegeName "+collegeName);
	}*/
	
	
	
	/*@Override
	public int hashCode(){
		if(city.equals("Delhi")){
			return 10;
		}
		if(city.equals("Mumbai")){
			return 20;
		}
		else
		{
			return 30;
		}
		//return name.length();
	}*/

}
