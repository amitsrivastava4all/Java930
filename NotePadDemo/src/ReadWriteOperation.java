import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class ReadWriteOperation {
	
	public static String readFile(File file) throws IOException{
		String result = "";
		StringBuilder sb = new StringBuilder();
		final int EOF =-1;
		if(file.exists()){
			// this is used to read a file
			FileInputStream fi = new FileInputStream(file);
			BufferedInputStream bi = new BufferedInputStream(fi);
			int singleByte = bi.read();  // It will read singleByte
			while(singleByte!=EOF){
				sb.append((char) singleByte);
				singleByte = bi.read(); // It will read the next byte
			}
			bi.close();
			fi.close();
		}
		else
		{
			result = "Unable to open this file";
		}
		result = sb.toString();
		return result;  //Convert StringBuilder into String
	}
	
	public static boolean writeInAFile(File file, String data) throws IOException{
		// This is only the Path we specified
		boolean isWrite = false;
		//String data = "This is the sample data to write in a file";
		//File file =new File("D:\\MyWS-2to4\\Java930\\files\\Test.txt");
		//File file =new File(path);
		boolean isFileCreated = file.createNewFile();  // here it create a new file
		if(isFileCreated){
			// Now open the file to do write operation
			FileOutputStream fo = new FileOutputStream(file,true);
			fo.write(data.getBytes());  // Convert string into bytes and then u can write bytes in a file
			fo.close();  // Close the file
			System.out.println("File Data Store....");
			isWrite = true;
		}
		else
		{
			System.out.println("Unable to create a file");
		}
		return isWrite;
	}
	public static void main(String[] args) throws IOException {
		//ReadWriteOperation.writeInAFile();
	}

}
