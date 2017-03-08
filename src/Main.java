import java.io.*;

/* Ao prof: colocar o codigo no arquivo teste presente na pasta raiz do projeto para executar */
/* Se for rodar o java -jar jcup e java -jar jflex verificar a importacao correta no eclipse pois aqui dah erro direto*/

public class Main {
	static PascalLexer pascalLexer;

	static public void main(String argv[]) {
		try {
			pascalLexer = new PascalLexer(new FileReader("teste"));
			parser p = new parser(pascalLexer);
			p.parse();
			if (parser.errors == 0){
				System.out.println("\nSem erros. :-)");
			}
		
			else {
				System.err.println("\nHá erros. :-(");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
