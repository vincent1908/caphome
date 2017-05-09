package bank;

/*
 * Declare some common parameters for scripts
 * You can change them to adapt your environment
 *
 */

public class Util {
	
	/* You can change the Path of FireFox based on your environment here */
	//public static final String FIREFOX_PATH = "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe";
	public static final String FIREFOX_PATH = "/Applications/Firefox.app/Contents/MacOS/firefox-bin";
	
	
	// Setting Base URL
	public static final String BASE_URL = "http://www.demo.guru99.com/";
    
	// Time to wait when searching for a GUI element 
	public static final int WAIT_TIME = 30; 
											

	// Valid account for login
	public static final String USER_NAME = "mngr68754";
	public static final String PASSWD = "hAqasAm";


	// Expected output
	public static final String EXPECT_TITLE = "Guru99 Bank Manager HomePage";
	

}
