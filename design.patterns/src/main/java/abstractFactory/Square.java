package abstractFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Square implements Shape {
	public static final Logger logger=LogManager.getLogger(Square.class);

	   @Override
	   public void draw() {
	      logger.info("Inside Square::draw() method.");
	   }
	}
