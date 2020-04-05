package com.learnmaven.linux;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Calculator {

    /**
     * build connection for log4j2 with main class.
     */

    static final Logger LOGGER = LogManager.getLogger(Calculator.class.getName());

    /**
     *
     * @param a
     * @param b
     * @return sum of two integer number
     */

    public int add(final int a, final int b) {
        LOGGER.traceEntry();
        LOGGER.error("a + b = %d");
        return a + b;
    }

    /**
     *
     * @param a
     * @param b
     * @return substract of two integer a and b
     */

    public int substract(final int a, final int b) {
        LOGGER.traceEntry();
        LOGGER.debug("a - b = %d");
        return a - b;
    }

    /**
     *
     * @param a
     * @param b
     * @return the multiply of two integer a and b
     */

    public int muliiply(final int a, final int b) {
        LOGGER.traceEntry();
        LOGGER.fatal("a * b = %d");
        return a * b;
    }

    /**
     *
     * @param a
     * @param b
     * @return a /b
     */
    public double divide(final float a, final float b) {
        LOGGER.traceEntry();

        if (b == 0.0) {
            LOGGER.error("a / b = %d");
            return 0.0;
        } else {
            LOGGER.error("a / b = %d");
            return a / b;
        }
    }
}
