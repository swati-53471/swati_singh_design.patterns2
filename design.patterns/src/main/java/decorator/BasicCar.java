package decorator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BasicCar implements Car {
public static final Logger logger=LogManager.getLogger(BasicCar.class);
@Override
	public void assemble() {
		logger.info("Basic car created");
	}

}