package aula01;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		//Primeira aula - Importando métodos, entendendo packages e criando o primeiro programa em Java.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hello, World! I'm learning Java!");
		System.out.println("Do you like Java? (yes/no): ");
		
		String answer = input.next();
		answer = answer.toLowerCase();
		input.close();
		
		if (answer.equals("yes")) {
			System.out.println("Let's go then!");
			return;
		}
		
		if (answer.equals("no")) {
			System.out.println("I think you must give it another chance!");
			return;
		}
		
		System.out.println("You must answer a valid option!");
	}

}
