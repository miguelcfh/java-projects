package switch_case;
import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Selecione um dia da semana (1-7): ");
		int dia = input.nextInt();
		String diaSemana;
		
		switch (dia) {
			case 1 -> diaSemana = "Domingo";
			case 2 -> diaSemana = "Segunda-feira";
			case 3 -> diaSemana = "Terça-Feira";
			case 4 -> diaSemana = "Quarta-feira";
			case 5 -> diaSemana = "Quinta-feira";
			case 6 -> diaSemana = "Sexta-feira";
			case 7 -> diaSemana = "Sábado";
			default -> diaSemana = "Inválido";
		}
		
		if (diaSemana.equals("Inválido")) {
			System.out.println("Selecione entre 1 e 7, por favor.");
			input.close();
			return;
		}
		
		System.out.printf("O dia %d corresponde a %s.", dia, diaSemana);
		input.close();
	}
}
