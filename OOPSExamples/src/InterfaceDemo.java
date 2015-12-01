// 100% Abstract (Java 7)
// Design (What to do)
interface DAO  // abstract interface DAO
{
	public void create();  //public abstract void create();
	public void delete();
	public void update();
	public void read();
}
// How to do
class MySQLDAO implements DAO{

	@Override
	public void create() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void read() {
		// TODO Auto-generated method stub
		
	}
	
}
class OracleDAO implements DAO{

	@Override
	public void create() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void read() {
		// TODO Auto-generated method stub
		
	}

}
class DAOExecutor
{
	void execute(DAO dao){
		dao.create();
		dao.delete();
		dao.update();
		dao.read();
		
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		DAOExecutor executor = new DAOExecutor();
		OracleDAO oracleDAO = new OracleDAO();
		executor.execute(oracleDAO);
		executor.execute(new MySQLDAO());
		
		

	}

}
