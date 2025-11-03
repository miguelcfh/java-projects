package encaps_abs;

public abstract class Diagrama
{
	protected String nome;
	protected double custo;
	protected String[] composicao;
	
	public Diagrama(String nome, double custo, String composicao[])
	{
		this.nome = nome;
		this.custo = custo;
		this.composicao = composicao;
	}
}
