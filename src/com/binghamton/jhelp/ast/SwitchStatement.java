package com.binghamton.jhelp.ast;

import java.util.List;
import java.util.ArrayList;

/**
 * A class representing a Java switch statement
 */
public class SwitchStatement extends Statement {
    private Expression condition;
    private List<CaseBlock> cases = new ArrayList<>();
}
