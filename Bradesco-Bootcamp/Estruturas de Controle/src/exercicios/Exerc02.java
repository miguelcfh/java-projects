package exercicios;
import java.util.Scanner;

public class Exerc02
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double peso, altura, imc;
		
		System.out.print("Digite o seu peso (kg): ");
		peso = input.nextDouble();
		
		System.out.print("Digite a sua altura (m): ");
		altura = input.nextDouble();
		
		imc = peso / (altura * altura);
		
		if (imc <= 18.5) {
			System.out.println("Você está abaixo do peso.");
			System.out.printf("IMC: %.2f", imc);
		}
		
		if (imc > 18.5 && imc <= 24.9) {
			System.out.println("Seu peso é ideal.");
			System.out.printf("IMC: %.2f", imc);
		}
		
		if (imc >= 25 && imc <= 29.9) {
			System.out.println("Você está acima do peso.");
			System.out.printf("IMC: %.2f", imc);
		}
		
		if (imc >= 30 && imc <= 34.9) {
			System.out.println("Obesidade grau I.");
			System.out.printf("IMC: %.2f", imc);
		}
		
		if (imc >= 35 && imc <= 39.9) {
			System.out.println("Obesidade grau II (Severa).");
			System.out.printf("IMC: %.2f", imc);
		}
		
		if (imc >= 40) {
			System.out.println("Obesidade grau III (Mórbida).");
			System.out.printf("IMC: %.2f", imc);
		}
	}

}
