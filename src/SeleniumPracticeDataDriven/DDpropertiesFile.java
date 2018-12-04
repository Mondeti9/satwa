package SeleniumPracticeDataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;


public class DDpropertiesFile {

	
	
	public static void main(String[] args) {
		System.out.println(propertiesFile());

	}
	
	
	public static HashMap<String, String> propertiesFile()
	{
		HashMap<String, String> map = new HashMap<String,String>();
		
		int count=0;
		
		try {
			FileInputStream fis = new FileInputStream("Libraries/data files/class_app.properties");
			Properties prop = new Properties();
			prop.load(fis);
			

			Set<Object> keyset= prop.keySet();
			for(Object keys:keyset)
			{
				String key = (String)keys;
				String value = prop.getProperty(key);
				map.put(key, value);
				count++;
			}
			
			
			
			} catch (  IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(map.get("Browser"));
		System.out.println("number of key-value set in Map    " +count);
		return map;
		
		
	}


	
	
	
	

}
