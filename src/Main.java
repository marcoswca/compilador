import java.io.*;

public class Main {
	static PascalLexer pascalLexer;

	static public void main(String argv[]) {
		try {
			pascalLexer = new PascalLexer(new FileReader("teste"));
			parser p = new parser(pascalLexer);
			p.parse();
			if (parser.errors == 0){
				System.out.println("\nSem erros.");
			}
		
			else {
				System.err.println("\nHá erros.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
