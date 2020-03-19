package template;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WoodenHouse extends HouseTemplate {
public static final Logger logger=LogManager.getLogger(WoodenHouse.class);
	@Override
	public void buildWalls() {
		logger.info("Building Wooden Walls");
	}

	@Override
	public void buildPillars() {
		logger.info("Building Pillars with Wood coating");
	}

}
