package com.binghamton.jhelp.ast;

import com.binghamton.jhelp.VariableSymbol;

import java.util.List;
import java.util.ArrayList;

/**
 * A class representing a Java catch block
 */
public class CatchBlock extends Block {
    private List<VariableSymbol> exceptions = new ArrayList<>();
}
