package exercicios;
import java.util.Scanner;

public class Exerc03
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int num1, num2, parOuImpar;
		
		System.out.print("Digite o primeiro número inteiro: ");
		num1 = input.nextInt();
		
		System.out.print("Digite o segundo número inteiro (significativamente maior que o primeiro): ");
		num2 = input.nextInt();
		
		System.out.print("Você deseja ver os números pares ou ímpares? (1 = ímpar / 2 = par): ");
		parOuImpar = input.nextInt();
		
		if (parOuImpar != 1 && parOuImpar != 2) {
			System.out.println("Você precisa escolher entre ímpar (1) ou par (2).");
			input.close();
			return;
		}
		
		for (int i = num2; i >= num1; i--) {
			if (parOuImpar == 1) {
				if (i % 2 == 1) {
					System.out.printf("%d => ímpar\n", i);
				}
				continue;
			}
			
			if (parOuImpar == 2) {
				if (i % 2 == 0) {
					System.out.printf("%d => par\n", i);
				}
				continue;
			}
		}
		
		input.close();
	}
}
