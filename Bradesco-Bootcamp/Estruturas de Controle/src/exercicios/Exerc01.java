package exercicios;
import java.util.Scanner;

public class Exerc01
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		int num = input.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(" ");
			System.out.printf("%d x %d = %d", num, i, (num * i));
		}
	}

}
