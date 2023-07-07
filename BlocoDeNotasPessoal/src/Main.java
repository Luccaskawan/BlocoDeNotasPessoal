import Model.BlocoDeNotasPessoal;
import Model.Pessoa;
import Screen.Screen;
import Service.BlocoDeNotasService;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) throws InterruptedException
	{
		Scanner in = new Scanner(System.in);
		int opcaoSelecionada = 0;
		do
		{
			System.out.println(Screen.telaPrincipal());
			opcaoSelecionada = in.nextInt();
			BlocoDeNotasPessoal blocoDeNotasPessoal = new BlocoDeNotasPessoal();
			System.out.println(Screen.nomeUser());
			String nome = in.nextLine();
			blocoDeNotasPessoal.setPessoa(new Pessoa(nome));
			BlocoDeNotasService blocoService = new BlocoDeNotasService();
			switch (opcaoSelecionada)
			{
				case 1:
					System.out.println(Screen.perguntaCaminhoCriar());
					String caminhoEscrever = in.nextLine();
					System.out.println("Digite o nome do arquivo: ");
					String nomeArquivo = in.nextLine();
					caminhoEscrever = caminhoEscrever+"\\"+nomeArquivo;
					blocoDeNotasPessoal.setArquivo(caminhoEscrever);
					blocoService.adicionarNotaAoBlocoDeNotas(caminhoEscrever);
					break;
				case 2:
					System.out.println(Screen.perguntaCaminhoLeitura());
					String caminhoLer = in.next();
					blocoService.lerBlocoDeNotas(caminhoLer);
					blocoDeNotasPessoal.setArquivo(caminhoLer);
					break;
				case 0:
					System.out.println("Saindo do bloco de notas...");
					Thread.sleep(500);
			}
		}while (opcaoSelecionada != 0);

		in.close();
	}
}