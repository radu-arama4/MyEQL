package com.company.Controller;

import com.company.EQL_ANTLR.Generated.EQLLexer;
import com.company.EQL_ANTLR.Generated.EQLParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {
    public static void main(String[] args) {

        EQLLexer lexer = new EQLLexer(CharStreams.fromString("filter:{" +
                "to: test@gmail.com " +
                "subject:jora}"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        EQLParser parser = new EQLParser(tokens);

        EQLParser.ProgramContext tree = parser.program();

        MyListener extractor = new MyListener();
        ParseTreeWalker.DEFAULT.walk(extractor, tree);
    }
}
