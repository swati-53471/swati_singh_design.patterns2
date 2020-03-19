package template;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GlassHouse extends HouseTemplate {
	public static final Logger logger=LogManager.getLogger(WoodenHouse.class);

	@Override
	public void buildWalls() {
		logger.info("Building Glass Walls");
	}

	@Override
	public void buildPillars() {
		logger.info("Building Pillars with glass coating");
	}

}
