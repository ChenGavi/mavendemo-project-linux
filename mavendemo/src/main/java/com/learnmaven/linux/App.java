
/**
 * Author: Gavin Chen
 * Date Apr 4 2020
 *
 */

package com.learnmaven.linux;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;



public class App {

    /**
     * for log4j2.
     */
    private static final Logger LOGGER = LogManager.getLogger(App.class);

    /**
     * Main Function.
     * @param args
     */

    public static void main(final String[] args) {

        LOGGER.trace("Entering Application");

        LOGGER.trace("we 've just traced the user!");
        LOGGER.debug("We've just debug the user!");
        LOGGER.info("we've just info the user!");
        LOGGER.warn("we;ve just warn the user!");
        LOGGER.error("we've just error the user!");
        LOGGER.fatal("we've just fatal error");

        Calculator calc = new Calculator();

        LOGGER.debug(calc.add(1, 2));
        LOGGER.debug(calc.substract(1, 2));
        LOGGER.warn(calc.muliiply(1, 2));
        LOGGER.info(calc.divide(1, 2));

        LOGGER.trace("Exiting application");
    }
}
