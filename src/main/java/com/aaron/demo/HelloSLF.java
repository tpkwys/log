package com.aaron.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @program: log
 * @description:
 * @author: tianpanke
 * @create: 2020-03-17
 **/
public class HelloSLF {

    public static void main(String[] args) {
        Logger logger= LoggerFactory.getLogger(HelloSLF.class);
        logger.trace("trace");
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
    }
}
