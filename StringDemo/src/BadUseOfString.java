
public class BadUseOfString {

	public static void main(String[] args) {
		String os="android";
		double price = 35000;
		String productType ="";
		boolean isWhere = false;
		String sql = "select * from product ";
		if(productType!=null && productType.trim().length()>0){
			isWhere = true;
			sql = sql + " where type='"+productType+"'";
		}
		if(price>0 && isWhere){
			sql = sql +" and price>"+price;
		}
		else
		{
			sql = sql + " where price>"+price;
			isWhere=true;
		}

	}

}
