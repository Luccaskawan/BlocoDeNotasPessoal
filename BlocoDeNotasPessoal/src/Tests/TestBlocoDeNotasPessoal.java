package Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import Service.BlocoDeNotasService;
import java.io.*;
import org.junit.jupiter.api.Test;

public class TestBlocoDeNotasPessoal
{
	@Test
	public void testLerBlocoDeNotas() throws IOException {
		String caminhoArquivo = "arquivo.txt";
		String conteudoEsperado = "Primeira notaSegunda nota";

		BufferedWriter escritor = new BufferedWriter(new FileWriter(caminhoArquivo));
		escritor.write(conteudoEsperado);
		escritor.close();

		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outputStream));

		BlocoDeNotasService blocoDeNotasService = new BlocoDeNotasService();
		blocoDeNotasService.lerBlocoDeNotas(caminhoArquivo);

		assertEquals(conteudoEsperado, outputStream.toString().trim());

		File arquivo = new File(caminhoArquivo);
		arquivo.delete();
	}

	@Test
	public void testAdicionarNotaAoBlocoDeNotas() throws IOException {
		String caminhoArquivo = "arquivo.txt";
		String notaAdicionada = "Nova nota";

		ByteArrayInputStream inputStream = new ByteArrayInputStream(notaAdicionada.getBytes());
		System.setIn(inputStream);

		BlocoDeNotasService blocoDeNotasService = new BlocoDeNotasService();
		blocoDeNotasService.adicionarNotaAoBlocoDeNotas(caminhoArquivo);

		BufferedReader leitor = new BufferedReader(new FileReader(caminhoArquivo));
		String conteudoArquivo = leitor.readLine();
		leitor.close();

		assertEquals(notaAdicionada, conteudoArquivo);

		File arquivo = new File(caminhoArquivo);
		arquivo.delete();
	}
}
