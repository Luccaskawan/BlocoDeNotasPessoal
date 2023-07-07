package Model;

public class BlocoDeNotasPessoal extends BlocoDeNotas
{
	private Pessoa pessoa;

	public BlocoDeNotasPessoal(String arquivo, Pessoa pessoa)
	{
		super();
		this.pessoa = pessoa;
	}
	 public BlocoDeNotasPessoal(){
		 super();
	 }

	public Pessoa getPessoa()
	{
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa)
	{
		this.pessoa = pessoa;
	}
}
