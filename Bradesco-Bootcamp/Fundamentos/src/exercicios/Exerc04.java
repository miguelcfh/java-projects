package exercicios;
import java.util.Scanner;

public class Exerc04
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		String nome1, nome2, mensagem;
		int idade1, idade2, diferenca;
		
		System.out.println("Digite o nome da primeira pessoa:");
		nome1 = input.next();
		
		System.out.println("Digite a idade da primeira pessoa:");
		idade1 = input.nextInt();
		
		System.out.println("Digite o nome da segunda pessoa:");
		nome2 = input.next();
		
		System.out.println("Digite a idade da segunda pessoa:");
		idade2 = input.nextInt();
		
		if (idade1 == idade2) {
			System.out.printf("%s e %s possuem %d anos.", nome1, nome2, idade1);
			return;
		}
		
		if (idade1 > idade2) {
			diferenca = idade1 - idade2;
			mensagem = "%s é %d anos mais velho(a) que %s.";
			
			if (diferenca == 1) {
				mensagem = "%s é %d ano mais velho(a) que %s.";
			}
			
			System.out.printf(mensagem, nome1, diferenca, nome2);
			return;
		}
		
		if (idade2 > idade1) {
			diferenca = idade2 - idade1;
			mensagem = "%s é %d anos mais velho(a) que %s.";
			
			if (diferenca == 1) {
				mensagem = "%s é %d ano mais velho(a) que %s.";
			}
			
			System.out.printf(mensagem, nome2, diferenca, nome1);
			return;
		}
	}
}
