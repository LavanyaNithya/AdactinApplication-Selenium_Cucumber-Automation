package com.datareader;

import java.io.IOException;

public class DataReaderManager {
	
	//create one private constructor
	//one normal method
	//one static method
	
	private DataReaderManager()            //creating private constructor so that object for this class
	                                       //cannot be created in any other classes to hide details 
	{
		                                   
	}
	
	public DataReader getInstanceDR() throws IOException
	{
		DataReader dr = new DataReader();        //creating object for DataReader class to access 
		                                         //properties class
		return dr;
	}
	
	public static DataReaderManager getInstanceDRM()
	{
		DataReaderManager drm = new DataReaderManager();  //creating object for DRM since it cannot
		return drm;                                       //be created in any other classes
	}                                                     //This method can be accessed only 
                                                          //using class name as it is a static method
}

