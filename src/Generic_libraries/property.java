package Generic_libraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



public class property {
	
	public static String getData(String path,String key) throws FileNotFoundException, IOException 
	{
		Properties p=new Properties();
		
		p.load(new FileInputStream(path));
		
		String value = p.getProperty(key);
		System.out.println(value);
		
		return value;

}
}

