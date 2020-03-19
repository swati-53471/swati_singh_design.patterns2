package template;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HouseTemplateTest {
	public static final Logger logger=LogManager.getLogger(WoodenHouse.class);

	public static void main(String[] args) {
			
			HouseTemplate houseType = new WoodenHouse();
			
			houseType.buildHouse();
			logger.info("************");
			
			houseType = new GlassHouse();
			
			houseType.buildHouse();
		}

}

