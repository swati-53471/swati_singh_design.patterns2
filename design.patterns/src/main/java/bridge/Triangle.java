package bridge;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Triangle extends Shape{
public static final Logger logger=LogManager.getLogger(Triangle.class);
	public Triangle(Color c) {
		super(c);
	}

	@Override
	public void applyColor() {
		logger.info("Triangle filled with color ");
		color.applyColor();
	} 

}