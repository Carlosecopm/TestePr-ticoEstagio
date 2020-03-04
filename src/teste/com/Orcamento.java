package teste.com;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Orcamento {

	public void criarOrcamento() {
		// TODO Auto-generated method stub
		System.out.printf("Chamou a classe:\n");

	}

	// Método para ler os arquivos.
	public void lerArquivos() throws FileNotFoundException {
		Scanner scanner = new Scanner(new FileReader("Funcionalidades.txt")).useDelimiter("\\||\\n");
		while (scanner.hasNext()) {
			String codigoFunc = scanner.next();
			int codigoFuncionalide = Integer.parseInt(codigoFunc);
			String descricao = scanner.next();
			
			System.out.print(codigoFuncionalide);
			System.out.println(descricao);
			
		}
		
		Scanner scanner2 = new Scanner(new FileReader("Modulos.txt")).useDelimiter("\\||\\n");
		while (scanner2.hasNext()) {
			String codigoMod = scanner2.next();
			int codigoModulo = Integer.parseInt(codigoMod);
			String descricaoModulo = scanner2.next();
			String moduloBasico = scanner2.next();
			String preco = scanner2.next();
			float precoModulo = Float.valueOf(preco).floatValue();
			
			System.out.print(codigoModulo);
			System.out.print(descricaoModulo);
			System.out.print(moduloBasico);
			System.out.println(precoModulo);
		}
	}
}