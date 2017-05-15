package com.binghamton.jhelp.error;

/**
 * A class to wrap uncaught exceptions thrown by the application so that the
 * end-user sees a program error, not an exception stack trace.
 */
public class ApplicationError extends JHelpError {
    private Exception e;
    private String filename;

    /**
     * Constructs a new ApplicationError on a given Exception
     * @param e the Exception to be wrapped
     */
    public ApplicationError(Exception e) {
        this.e = e;
    }

    /**
     * Constructs a new ApplicationError on a given Exception
     * @param e the Exception to be wrapped
     * @param filename the name of the file that was being examined
     */
    public ApplicationError(Exception e, String filename) {
        this.e = e;
        this.filename = filename;
    }

    @Override
    public String getMessage() {
        StringBuilder sb = new StringBuilder("An application error has occured");
        if (filename != null) {
            sb.append(" while processing the file '");
            sb.append(filename);
            sb.append("'");
        }
        sb.append(".\n");
        sb.append("This likely means an earlier error has put the application in an unrecoverable state.\n");
        sb.append("Try resolving the earlier errors and re-running the application");
        return sb.toString();
    }
}
