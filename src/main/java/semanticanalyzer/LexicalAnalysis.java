package semanticanalyzer;


import java.io.*;
import java_cup.runtime.*;

public class LexicalAnalysis {

    public static void main(String[] args) {
        Symbol sym;
        String path = "/Users/bruna/Documents/compiladores-ufcg/src/main/java/semanticanalyzer/pascal.pas";
        try {
            Lexer lexer = new Lexer(new FileReader(path));
            for (sym = lexer.next_token(); sym.sym != 0;
                    sym = lexer.next_token()) {

                System.out.println("Token " + sym +
                    ", with value = " + sym.value +
                    "; at line " + sym.left + ", column " + sym.right);

            }
        }
        catch (Exception e) {
        }
    }
}
