package view;

import java.io.FileReader;
import java.util.Properties;

public class FIleRead {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		FileReader reader=new FileReader("station.properties");
		
		Properties airports=new Properties();
		airports.load(reader);
		
		System.out.println(airports.getProperty("MAA"));
		System.out.println(airports.getProperty("CBE"));
		System.out.println(airports.getProperty("HYD"));
	}

}
