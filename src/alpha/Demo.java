package alpha;

import org.apache.logging.log4j.*;

public class Demo {
	private static Logger log=LogManager.getLogger(Demo.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     log.error("Unable to click on the button");
     log.fatal("Fatal error");
     log.info("Successfully entered username and password");
     log.debug("Debug information displayed");
	}

}
