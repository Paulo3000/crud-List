package br.com.crud;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Crud {

	Set<String> nomes = new HashSet<>();
	List<String> pegaNomes;

	Scanner teclado = new Scanner(System.in);
	String coleta;

	public void menu() {
		System.out.println("SISTEMA DE CADASTRO");
		System.out.println("1-CADASTAR NOME");
		System.out.println("2-LISTAR NOME");
		System.out.println("3-EDITAR UM NOME");
		System.out.println("4-REMOVER UM NOME");
		System.out.println("5-VERIFICAR SE NOME EXISTE");
		System.out.println("0-VOLTAR");

		System.out.println("\nEntre com uma opção\n");
	}

	public void banco() {
		nomes.add("Paulo Sérgio");
		nomes.add("Jonas Marcos");
		nomes.add("Paula Julia");
		nomes.add("Maria Claudia");
		nomes.add("Stefani Pedroso");
		nomes.add("Maria Cristina");
		nomes.add("Patrica Acantara");
		nomes.add("Pedro Felipe");
		nomes.add("Maicon José");
		nomes.add("Marcelo Ricardo");
	}

	public void inserir() {
		coleta = teclado.nextLine();
		nomes.add(coleta);
		System.out.println("Cadastrado com sucesso");
	}

	public void deletar() {
		System.out.println("Digite o nome que deseje remover da lista");
		coleta = teclado.nextLine();
		if (nomes.remove(coleta)) {
			System.out.println("Nome removido comsucesso");
		}
	}

	public void consultar() {

		System.out.println("Informe o nome que deseja consultar ");
		coleta = teclado.nextLine();
		nomes.contains(coleta);

		Pattern pattern = Pattern.compile(coleta, Pattern.CASE_INSENSITIVE);

		Matcher matcher = pattern.matcher(coleta);

		if (matcher.find()) {
			System.out.println("O nome existe na lista");
		} else {
			System.out.println("Nome não encontrao");
		}

		System.out.println("\n\n--IMPRIMINDO NOMES DA LISTA ---");
		existente();

	}

	public void alterar() {

		int escolha = 0;
		String capturaNome;
		pegaNomes = new ArrayList<>(nomes);
		existente();

		System.out.println("Informe a posição do nome que  deseja alterar\n");
		escolha = teclado.nextInt();

		System.out.println("\n " + pegaNomes.get(escolha));
		teclado.nextLine();
		capturaNome = pegaNomes.get(escolha);
		System.out.println("Faça as alterações nescessárias\n");
		coleta = teclado.nextLine();

		nomes.remove(capturaNome);
		nomes.add(coleta);
		System.out.println("Alterado com sucesson\n");
		existente();

	}

	public void existente() {
		int index = -1;
		for (String nome : nomes) {
			index++;
			System.out.println(index + "-" + nome);
		}
	}

	public void mensagem() {
		System.out.println("Entrada inválida");

	}

}
