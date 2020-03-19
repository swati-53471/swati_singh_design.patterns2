package singleton;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SingletonEmployee {

	public static final Logger logger=LogManager.getLogger(SingletonEmployee.class);
	private static SingletonEmployee Employee=new SingletonEmployee();
	
	private SingletonEmployee()
	{
		
	}
	
	public static SingletonEmployee getInstance()
	{
		return Employee;
	}
	 public void showMessage()
	 {
		logger.info("Employee database updated"); 
	 }
}
