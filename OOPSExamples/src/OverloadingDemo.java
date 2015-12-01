class OnlineShopSearch
{
/*	void search(String brandwise){
		System.out.println("Searching By Brand "+brandwise);
	}*/
	String search(String brandwise){
		System.out.println("Searching By Brand "+brandwise);
		return null;
	}
	double search(double price){
		System.out.println("Searching By Price "+price);
		return price;
	}
	int search(String brandWise,double price){
		System.out.println("Searching By Brand and Price "+brandWise+price);
		return 0;
	}
}
public class OverloadingDemo {

	public static void main(String[] args) {
		OnlineShopSearch shop = new OnlineShopSearch();
		shop.search(9000.00);
		shop.search("Apple");
		shop.search("Apple",60000);

	}

}
