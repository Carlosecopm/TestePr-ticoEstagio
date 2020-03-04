package teste.com;

import java.io.*;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner lerOpcao = new Scanner(System.in);
		int opcao = 0;
		// TODO Auto-generated method stub
		System.out.println("Escolha uma opção");

		System.out.println("Opção 1: Cadastrar Funcionalidade");
		System.out.println("Opção 2: Cadastrar Modulo");
		System.out.println("Opção 3: Orçamento");
		opcao = lerOpcao.nextInt();

		switch (opcao) {
		case 1:
			Scanner lerFuncionalidade = new Scanner(System.in);

			System.out.printf("Informe a nova funcionalidade:\n" + "\n exemplo:\nCódigo do Módulo|Descrição");
			String novaFuncionalidade = lerFuncionalidade.nextLine();
			cadastrarFuncionalidade(novaFuncionalidade);
			System.out.printf("Voltou do método:\n");
			break;
		case 2:
			Scanner lerModulo = new Scanner(System.in);

			System.out.printf("Informe a nova funcionalidade:\n" + "\n exemplo:\nCódigo|Descrição|Módulo Básico|Preço");
			String novoModulo = lerModulo.nextLine();
			cadastrarModulo(novoModulo);
			System.out.printf("Voltou do método:\n");
			break;
		case 3:
			Orcamento novo = new Orcamento();
			novo.lerArquivos();
			System.out.printf("Voltou da classe:\n");
			break;
		default:
			// code block
		}

	}

	

	public static void cadastrarFuncionalidade(String novaFuncionalidade) {

		try (FileWriter fw = new FileWriter("Funcionalidades.txt", true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bw)) {

			out.println(novaFuncionalidade);

			System.out.println("Funcionalidade cadastrada com sucesso");
			return;
		} catch (IOException e) {
			// exceção
		}
	}

	public static void cadastrarModulo(String novoModulo) {
		try (FileWriter fw = new FileWriter("Modulos.txt", true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bw)) {
			out.println(novoModulo);
			System.out.println("Modulo cadastrado com sucesso");
			return;
		} catch (IOException e) {
			// exceção
		}
	}

}
