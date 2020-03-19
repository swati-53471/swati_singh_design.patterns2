package decorator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SportsCar extends CarDecorator {
	public static final Logger logger=LogManager.getLogger(BasicCar.class);


	public SportsCar(Car c) {
		super(c);
	}

	@Override
	public void assemble(){
		super.assemble();
		logger.info(" Decorating Sports Car.");
	}
}