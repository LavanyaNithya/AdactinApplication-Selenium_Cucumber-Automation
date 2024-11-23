
package com.datareader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataReader {
	
	Properties p;                   
	
	public DataReader() throws IOException
	{
	
	File f = new File("C:\\Users\\Dell\\eclipse-workspace\\AdactinProject1\\src\\main\\java\\com\\propertyfile\\Example1.properties");

	//file class to get the path of the property file
	
	FileInputStream fis = new FileInputStream(f);   //To read the data from file
	
	p = new Properties();         //properties class to get the value from fis
	
	p.load(fis);                 //loading data from fis to property p
	
	}
	
	//Login page
	
	public String getPropUrl()
	{
		String url = p.getProperty("url");              //getting url from property p
        return url;		
		
	}
	
	public String getPropUsername()
	{
		String username = p.getProperty("username");
		return username;
		
	}
	
	public String getPropPassword()
	{
		String password = p.getProperty("password");
		return password;
		
	}
	
	//Search Page
	
	
	public String getPropCheckin()
	{
		String check_in = p.getProperty("check_in");
	    return check_in;
	
	}
	
	public String getPropcheckout()
	{
		String check_out = p.getProperty("check_out");
	    return check_out;
	
	}
	
	
	//Booking Page
	
	public String getPropFirstname()
	{
		String f_name = p.getProperty("f_name");
		return f_name;
		
	}
	
	public String getPropLastname()
	{
		String l_name = p.getProperty("l_name");
		return l_name;
		
	}
	
	public String getPropAddress()
	{
		String address = p.getProperty("address");
		return address;
		
	}
	
	public String getPropccnum()
	{
		String cc_num = p.getProperty("cc_num");
		return cc_num;
		
	}
	
	public String getPropcccvv()
	{
		String cc_cvv = p.getProperty("cc_cvv");
		return cc_cvv;
		
	}
	
}
