package alpha;


import org.apache.logging.log4j.*;



public class Demo {
	private static Logger log=LogManager.getLogger(Demo.class.getName());
	public static void main(String[] args) {
		log.debug("I am debugging");
		log.error("Failure message");
		log.info("Success message");
		log.fatal("Fatal test");
		
	}

}
