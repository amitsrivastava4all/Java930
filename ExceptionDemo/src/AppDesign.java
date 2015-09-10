import java.sql.SQLException;

class App{
	void dbLogic() throws SQLException{
		try{
		System.out.println("Connection Open");
		//try{
		//int e = 10/0;  // throw new ArithmeticException();
		if(100>20){
		//System.exit(0);
			//return ;
			throw new SQLException(); // Just for Simulation	
		}
		System.out.println("Query to the DB");
		/*}
		catch(ArithmeticException e){
			System.out.println("Some Problem Raised "+e);
		}*/
		
		System.out.println("Result Traverse ");
		}
		finally{
		System.out.println("Connection Close");
		}
		}
	void bl() throws SQLException{
		System.out.println("BL Starts");
		dbLogic();
		System.out.println("BL Ends");
	}
	void ui() throws SQLException{
		System.out.println("UI Starts");
		bl();
		System.out.println("UI Ends");
	}
}
public class AppDesign {

	public static void main(String[] args) {
		App obj = new App();
		try{
		obj.ui();
		}
		catch(SQLException e){
			System.out.println(e);
		}
		System.out.println("Come Back");

	}

}
