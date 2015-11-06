import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class ReadPageData {
	
	public static void main(String[] args) throws Exception {
		downloader("http://google.com/","img[src]");
	}
	
	public static void downloader(String urlString, String pattern) throws Exception {
		FileOutputStream fo = null;
		String basePath = "D:\\MyWS-2to4\\files\\";
		Scanner scanner = new Scanner(System.in);
		//System.out.println("Enter the URL");
		//String urlString = scanner.next();
		Document doc = Jsoup.connect(urlString).get();
		Elements elements = doc.select(pattern);
		//System.out.println(elements);
		
		//urlString = urlString + "/logos/doodles/2015/adolphe-saxs-201st-birthday-6443879796572160-5764640680181760-ror.jpg";
		//System.out.println("Full Path is "+urlString);
		
		Iterator<Element> element= elements.iterator();
		while(element.hasNext()){
			Element currentElement = element.next();
			String path = currentElement.attr("src");
			String fullPath = "";
			//System.out.println("Path is "+path);
			fullPath = urlString + path;
			System.out.println("Full Path is "+fullPath);
			int lastIndex = fullPath.lastIndexOf("/");
			String fileName = fullPath.substring(lastIndex);
		
		URL url = new URL(fullPath);
		URLConnection connection = url.openConnection();
		connection.connect();
		InputStream is = connection.getInputStream();
		int singleByte = is.read();
		
		fo = new FileOutputStream(basePath+fileName);
		while(singleByte!=-1){
			//System.out.print((char)singleByte);
			fo.write(singleByte);
			singleByte = is.read();
			
		}
		is.close();
		scanner.close();
		System.out.println("File Has Been Downloaded....");
		}
	}

}
