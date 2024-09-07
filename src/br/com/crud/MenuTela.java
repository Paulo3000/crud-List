package br.com.crud;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MenuTela {

	public static void main(String[] args) {

		String coleta;
		Scanner teclado = new Scanner(System.in);
		Crud crud = new Crud();
		crud.banco();
		crud.menu();

		while (true) {
			try {

				
				coleta = teclado.next();
				Integer.parseInt(coleta);

				switch (coleta) {
				case "1":
					System.out.println("Entre com um nome inteiro\n");
					crud.inserir();
					break;
				case "2":
					System.out.println("Mostrando lista de nomes\n");
					crud.existente();
					break;
				case "3":
					System.out.println("Edite um nome\n");
					crud.alterar();
					break;
				case "4":
					System.out.println("Remova um nome\n");
					crud.deletar();
					break;

				case "5":
					System.out.println("Consultando nome\n");
					crud.consultar();
					break;
				case "0":
					crud.menu();
					break;
				default:
					System.out.println("Opção inválida");
				}

			
			}catch (NumberFormatException e) {
				crud.mensagem();
			}
			
		}

	}

}
