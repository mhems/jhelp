package com.binghamton.jhelp.error;

import java.io.IOException;

/**
 * A trivial wrapper class around IOException to make it unchecked
 */
public class UncheckedIOException extends RuntimeException {
    public static final long serialVersionUID = 0;
    private IOException e;

    /**
     * Construct an UncheckedIOException from a checked one
     * @param e the exception to wrap
     */
    public UncheckedIOException(IOException e) {
        this.e = e;
    }
}
