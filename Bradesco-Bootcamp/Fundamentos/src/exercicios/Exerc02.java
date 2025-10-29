package exercicios;
import java.util.Scanner;

public class Exerc02
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o valor do lado de um quadrado:");
		
		double lado = input.nextDouble();
		double area = Math.pow(lado, 2);
		
		System.out.printf("A área do quadrado digitado é: %.2f\n", area);
	}
}
