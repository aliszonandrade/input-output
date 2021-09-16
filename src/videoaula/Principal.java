package videoaula;

import java.io.IOException;

public class Principal {

	public static void main(String[] args) throws IOException {
		new Manipulacao().CriarArquivo();
		new Manipulacao().LerArquivo();

	}

}
