package encaps_abs;

public class Main
{

	public static void main(String[] args)
	{
		String[] composicao = {"Cobre", "Lingote de obsidiana"};
		Espada sword = new Espada("Aerondight", 4390.90, composicao);
		
		String[] runas = {"Runa de fogo", "Runa de sangramento"};
		sword.setRunas(runas);
		
		System.out.println(sword.getRunas());
	}

}
