package encaps_abs;

public class Main
{

	public static void main(String[] args)
	{
		String[] composicao = {"Cobre", "Lingote de obsidiana"};
		Espada sword = new Espada("Aerondight", 4390.90, composicao, 270);
		
		String[] runas = {"Runa de fogo", "Runa de sangramento"};
		
		sword.inserirRunas(runas);
		
		sword.mostrarInfo();
		
		// String.join(", ") -> Retorna um array em formato de string, separado por vírgulas.
	}

}
