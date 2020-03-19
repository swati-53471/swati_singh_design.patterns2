package abstractFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class RoundedRectangle implements Shape {
	public static final Logger logger=LogManager.getLogger(RoundedRectangle.class);

@Override
public void draw() {
	 logger.info("Inside RoundedRectangle::draw() method.");
}
}