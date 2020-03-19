package abstractFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class RoundedSquare implements Shape {
	public static final Logger logger=LogManager.getLogger(RoundedSquare.class);

		   @Override
		   public void draw() {
		      logger.info("Inside RoundedSquare::draw() method.");
		   }
}

