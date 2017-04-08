package com.binghamton.jhelp.error;

public class ExceptionError extends JHelpError {
    private final Exception ex;

    public ExceptionError(Exception ex) {
        this.ex = ex;
    }

    @Override
    public String getMessage() {
        return ex.toString();
    }
}
