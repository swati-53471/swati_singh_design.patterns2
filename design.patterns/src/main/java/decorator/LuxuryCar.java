package decorator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LuxuryCar extends CarDecorator {
	public static final Logger logger=LogManager.getLogger(BasicCar.class);

	public LuxuryCar(Car c) {
		super(c);
	}
	
	@Override
	public void assemble(){
		super.assemble();
		logger.info(" Decorating Luxury Car.");
	}
}