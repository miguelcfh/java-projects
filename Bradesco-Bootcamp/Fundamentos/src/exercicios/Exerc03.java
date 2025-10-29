package exercicios;
import java.util.Scanner;

public class Exerc03
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a base de um retângulo:");
		double base = input.nextDouble();
		
		System.out.println("Digite a altura de um retângulo:");
		double altura = input.nextDouble();
		
		double area = base * altura;
		
		System.out.printf("A área do retângulo é: %.2f\n", area);
		
		input.close();
	}
}
