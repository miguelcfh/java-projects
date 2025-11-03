package encaps_abs;

public class Espada extends Diagrama
{
	private String[] runas;
	private double dano;
	
	public Espada(String nome, double custo, String[] composicao, double dano)
	{
		super(nome, custo, composicao);
		this.dano = dano;
	}
	
	public void inserirRunas(String[] runas)
	{
		this.runas = runas;
	}
	
	public void mostrarInfo()
	{
		System.out.println("Informações da Espada:");
		System.out.println("Nome: " + super.nome);
		System.out.printf("Custo: %.2f\n", super.custo);
		System.out.println("Composição: " + String.join(", ", super.composicao));
		if (!this.runas.equals(null)) {
			System.out.println("Runas: " + String.join(", ", this.runas));
		}
		System.out.printf("Dano: %.1f\n", this.dano);
	}
}
