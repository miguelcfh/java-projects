package encaps_abs;

public abstract class Diagrama
{
	private String nome;
	private double custo;
	private String[] composicao;
	
	public Diagrama(String nome, double custo, String composicao[])
	{
		this.nome = nome;
		this.custo = custo;
		this.composicao = composicao;
	}
}
