package Service;

import Interface.BlocoDeNotasInterface;
import Model.BlocoDeNotasPessoal;
import Screen.Screen;
import java.io.*;
import java.util.Scanner;

public class BlocoDeNotasService implements BlocoDeNotasInterface
{

	@Override
	public void lerBlocoDeNotas(String caminho)
	{
		try(BufferedReader leitor = new BufferedReader(new FileReader(caminho))){

			System.out.println(Screen.lerBlocoDeNotas(leitor));
		} catch (Exception e){
			System.out.println("Houve um erro ao ler o arquivo!");
		}
	}

	@Override
	public void adicionarNotaAoBlocoDeNotas(String caminho)
	{
		Scanner in = new Scanner(System.in);
		try(BufferedWriter escritor = new BufferedWriter(new FileWriter(caminho, true))){
			System.out.println("Escreva sua anotação: ");
			String anotacao = in.nextLine();
			escritor.write(anotacao);
			escritor.newLine();
		} catch (Exception e){
			System.out.println("Erro ao escrever no arquivo!");
		}
	}

}
