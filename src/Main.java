import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        //get input
        String inputFile = "test/binarysearch.java";
        CharStream input = CharStreams.fromFileName(inputFile);

        //lexical analysis
        MiniJavaLexer lexer = new MiniJavaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        //syntax analysis
        MiniJavaParser parser = new MiniJavaParser(tokens);
        ParseTree tree = parser.init();

        // print tree
        System.out.println(tree.toStringTree(parser));

        // Show AST in GUI
        JFrame frame = new JFrame("ANTLR AST");
        JPanel panel = new JPanel();
        TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
        panel.add(viewer);
        JScrollPane scrollPanel = new JScrollPane(panel, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        frame.getContentPane().add(scrollPanel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(800, 400);
        frame.setVisible(true);
    }
}
