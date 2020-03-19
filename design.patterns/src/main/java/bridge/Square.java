package bridge;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Square extends Shape{
	public static final Logger logger=LogManager.getLogger(Triangle.class);

	public Square(Color c) {
		super(c);
	}

	@Override
	public void applyColor() {
		logger.info("Square filled with color ");
		color.applyColor();
	} 

}