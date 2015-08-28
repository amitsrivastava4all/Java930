
public class GoodWay {

	public static void main(String[] args) {
		String os="android";
		double price = 35000;
		String productType ="";
		boolean isWhere = false;
		StringBuffer sql = new StringBuffer("select * from product ");
		if(productType!=null && productType.trim().length()>0){
			isWhere = true;
			sql = sql .append( " where type='").append(productType).append("'");
		}
		if(price>0 && isWhere){
			sql = sql .append(" and price>").append(price);
		}
		else
		{
			sql = sql .append( " where price>").append(price);
			isWhere=true;
		}

	}

}
