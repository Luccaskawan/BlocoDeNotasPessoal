package Screen;

import java.io.BufferedReader;
import java.io.IOException;

public class Screen
{
	public static String telaPrincipal(){
		StringBuilder bodyBuilder = new StringBuilder();
		bodyBuilder.append("\n---------- Bloco de notas pessoal----------\n");
		bodyBuilder.append("\n1- Adicionar nota");
		bodyBuilder.append("\n2- Ler nota");
		bodyBuilder.append("\n0- Sair\n");
		bodyBuilder.append("\n");
		return bodyBuilder.toString();
	}

	public static String nomeUser(){
		StringBuilder bodyBuilder = new StringBuilder();
		bodyBuilder.append("\nDigite seu nome: ");
		return bodyBuilder.toString();
	}

	public static String perguntaCaminhoCriar(){
		StringBuilder bodyBuilder = new StringBuilder();
		bodyBuilder.append("\nDigite o caminho para onde queira criar o arquivo: ");
		bodyBuilder.append("\nExemplo: D:\\Faculdade\\POO-TRABALHO2-MILHAO\\BlocoDeNotasPessoal");
		bodyBuilder.append("Em seguida irei pedir para você digitar qual o nome do arquivo que voce pretende dar...");
		return bodyBuilder.toString();
	}

	public static String perguntaCaminhoLeitura(){
		StringBuilder bodyBuilder = new StringBuilder();
		bodyBuilder.append("\nDigite o caminho da onde o arquivo está: ");
		bodyBuilder.append("\nExemplo: D:\\Faculdade\\POO-TRABALHO2-MILHAO\\BlocoDeNotasPessoal\\arquivo.txt");
		bodyBuilder.append("\nLembre-se se caso digitar errado ou a pasta não tiver a permissão correta,\nisso ira causar problemas.");
		bodyBuilder.append("\n");
		return bodyBuilder.toString();
	}

	public static String lerBlocoDeNotas(BufferedReader leitor) throws IOException
	{
		StringBuilder bodyBuilder = new StringBuilder();
		String linha = null;
		while ((linha = leitor.readLine()) != null){
			bodyBuilder.append(linha);
		}
		return bodyBuilder.toString();
	}
}
