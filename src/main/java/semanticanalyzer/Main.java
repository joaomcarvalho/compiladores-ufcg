package semanticanalyzer;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		String fileName = "/Users/bruna/Documents/compiladores-ufcg/src/main/java/semanticanalyzer/pascal.pas";

		Parser parser = new Parser(new Lexer(new FileReader(fileName)));
		try {
			parser.parse();
		} catch (Exception e) {
			System.out.println("Falha geral.");
		}
	}
}
