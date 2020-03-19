package abstractFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Rectangle implements Shape {
	public static final Logger logger=LogManager.getLogger(Rectangle.class);

		   @Override
		   public void draw() {
		      logger.info("Inside Rectangle::draw() method.");
		   }
		}


