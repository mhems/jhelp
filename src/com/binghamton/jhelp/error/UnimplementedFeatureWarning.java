package com.binghamton.jhelp.error;

public class UnimplementedFeatureWarning extends JHelpWarning {

    public UnimplementedFeatureWarning(String msg) {
        super(msg);
    }

    public UnimplementedFeatureWarning(String fmt, Object... args) {
        super(fmt, args);
    }
}
