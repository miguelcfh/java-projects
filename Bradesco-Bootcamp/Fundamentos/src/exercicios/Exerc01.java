package exercicios;
import java.util.Scanner;

public class Exerc01
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		String nome = input.next();
		
		System.out.println("Digite o ano em que você nasceu:");
		int idade = 2025 - input.nextInt();
		
		System.out.printf("Nossa, seu nome é %s e você tem %d anos, quem poderia imaginar!\n", nome, idade);
		input.close();
	}
}
