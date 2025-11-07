package authentication;

import database.DatabaseConnection;
import database.Usuario;
import java.util.Scanner;

public class Auth
{
    private Usuario usuario = new Usuario();

    public void cadastrarUsuario(String email, String senha)
    {
        if (email.isEmpty() || senha.isEmpty() || email.isBlank() || senha.isBlank()) {
            System.out.println("Todos os campos precisam ser preenchidos.");
            return;
        }

        if (usuario.verificarUsuarioExistente(email)) {
            System.out.println("O e-mail digitado já foi cadastrado. Tente utilizar outro endereço de e-mail.");
            return;
        }

        usuario.cadastrarUsuario(email, senha);
    }

    public void logarUsuario(String email, String senha)
    {
        if (email.isEmpty() || senha.isEmpty() || email.isBlank() || senha.isBlank()) {
            System.out.println("Todos os campos precisam ser preenchidos.");
            return;
        }

        usuario.logarUsuario(email, senha);
    }

    public static void main()
    {
        final Scanner input = new Scanner(System.in);
        final Auth authentication = new Auth();
        final String email;
        final String senha;
        int opcao;

        System.out.println("SELECIONE UMA OPÇÃO:");
        System.out.println("1 - CADASTRO");
        System.out.println("2 - LOGIN");
        while (true) {
            opcao = input.nextInt();

            if (opcao != 1 && opcao != 2) {
                System.out.println("SELECIONE UMA OPÇÃO VÁLIDA.");
                break;
            }

            if (opcao == 1) {
                System.out.println("Insira o seu endereço de e-mail:");
                email = input.next();

                System.out.println("Insira a sua senha:");
                senha = input.next();

                authentication.cadastrarUsuario(email, senha);
                break;
            }

            if (opcao == 2) {
                System.out.println("Insira o seu endereço de e-mail:");
                email = input.next();

                System.out.println("Insira a sua senha:");
                senha = input.next();

                authentication.logarUsuario(email, senha);
                break;
            }
        }
    }
}