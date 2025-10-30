package exercicios;
import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double num1, num2;
				
		System.out.print("Digite um número: ");
		num1 = input.nextDouble();
		
		while (true) {
			System.out.print("Digite outro número: ");
			num2 = input.nextDouble();
			
			if (num2 <= num1) {
				System.out.println("O segundo número precisa ser maior que o primeiro.");
				continue;
			}
			
			if (num2 % num1 == 0) {
				continue;
			}
			
			if (num1 % num2 != 0) {
				System.out.printf("O resto da divisão entre %.2f e %.2f é: %.2f\n", num1, num2, (num2 % num1));
				break;
			}
		}
	}

}
