package com.binghamton.jhelp.error;

/**
 * A base error class representing invalid use of the JHelp application
 */
public abstract class InvalidUseError extends JHelpError {
    public abstract String getMessage();
}
