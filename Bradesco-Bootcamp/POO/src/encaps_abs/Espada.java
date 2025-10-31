package encaps_abs;

public class Espada extends Diagrama
{
	private String[] runas;
	
	public Espada(String nome, double custo, String[] composicao)
	{
		super(nome, custo, composicao);
	}
	
	public void setRunas(String[] runas)
	{
		this.runas = runas;
	}
	
	public String[] getRunas()
	{
		return this.runas;
	}
}
