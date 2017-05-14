package utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigWriter {
	
	Properties properties;

	public ConfigWriter() {

		// TODO Auto-generated constructor stub
		try {
			Properties properties = new Properties();
			properties.setProperty("userName", "mngr773861");
			properties.setProperty("passWord", "UdYtEbu");
			

			File file = new File(
					"/Users/Gregoryvincent/git/caphome/POMExample/src/objectRepository/Object_Repo.properties");
			FileOutputStream fileOut = new FileOutputStream(file);
			properties.store(fileOut, "Favorite Things");
			System.out.println("------------------");
			fileOut.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		public void setUserName() {
			properties.setProperty("userName", "mngr77386");
		}
		
		public void setPassWord() {
			properties.setProperty("passWord", "UdYtEbu");

		}

		
	
	// public String getUserName() {
	// String uName = pro.getProperty("userName");
	// return uName;
	// }
	//
	// public String getPassWord() {
	// String pWord = pro.getProperty("passWord");
	// return pWord;
	// }

	// public static void main(String[] args) {
	// try {
	// Properties properties = new Properties();
	// // properties.setProperty("userName", "mngr77386");
	// // properties.setProperty("passWord", "UdYtEbu");
	//
	//
	//
	// File file = new
	// File("/Users/Gregoryvincent/git/caphome/POMExample/src/objectRepository/Object_Repo.properties");
	// FileOutputStream fileOut = new FileOutputStream(file);
	// properties.store(fileOut, "Favorite Things");
	// System.out.println("------------------");
	// fileOut.close();
	// } catch (FileNotFoundException e) {
	// e.printStackTrace();
	// } catch (IOException e) {
	// e.printStackTrace();
	// }
	//
	// }
}