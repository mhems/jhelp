package com.binghamton.jhelp.ast;

import java.util.List;
import java.util.ArrayList;

/**
 * A class representing a Java try/catch/finally block
 */
public class TryCatchBlock extends Statement {
    private List<Statement> resources = new ArrayList<>();
    private List<CatchBlock> catches = new ArrayList<>();
    private Block tryBody;
    private Block finallyBody;
}
