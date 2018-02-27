package alpha;

import com.oracle.tools.packager.Log;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by asingh on 1/18/18.
 */
public class Demo {

    private static Logger log = LogManager.getLogger(Demo.class.getName());

    public static void main(String[] args) {

        log.debug("I am debugging");
        if(5>4)
            Log.info("object is present");
        log.error("object is not present");

        log.fatal("this is fatal error.");



    }



}
