/*
 * Copyright (c) 2023 Benjamin Wagner
 */

package core;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

public class ExceptionHandler implements Thread.UncaughtExceptionHandler {

    public static Logger LOGGER = LoggerFactory.getLogger(ExceptionHandler.class);
    public static Boolean DEV = false;
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        new ExceptionDialog(e);
    }
}
