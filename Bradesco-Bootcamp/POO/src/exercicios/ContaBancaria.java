package exercicios;
import java.util.Scanner;
//Exercício 01

public class ContaBancaria
{
	private double saldo;
	private double chequeEspecial;
    private double taxaDeUsoChequeEspecial;
    final private double limiteCheque;
	
	public ContaBancaria(double saldo)
    {
        this.saldo = saldo;

        if (saldo < 500) {
            this.chequeEspecial = 50.00;
            this.limiteCheque = chequeEspecial + saldo;
            return;
        }

        this.chequeEspecial = saldo / 2;
        this.limiteCheque = chequeEspecial + saldo;
	}
	
	public double consultarSaldo()
	{
		return this.saldo;
	}
	
	public double consultarChequeEspecial()
	{
		return this.chequeEspecial;
	}

    public void atualizarSaldo(double saldo)
    {
        this.saldo = saldo;
    }

    public void atualizarChequeEspecial(double chequeEspecial)
    {
        this.chequeEspecial = chequeEspecial;
    }

    public double consultarTaxaChequeEspecial()
    {
        return this.taxaDeUsoChequeEspecial;
    }

    public void atualizarTaxaChequeEspecial(double taxa)
    {
        this.taxaDeUsoChequeEspecial += taxa;
    }

    public void pagarTaxaChequeEspecial()
    {
        if (this.saldo > this.taxaDeUsoChequeEspecial) {
            this.saldo -= this.taxaDeUsoChequeEspecial;
        }
    }
	
	public void depositarDinheiro(double valor)
	{
        this.saldo += valor;
    }
	
	public void sacarDinheiro(double valor)
	{
        if (this.saldo < valor) {
            System.out.println("Saldo insuficiente.");
            return;
        }

        this.saldo -= valor;
    }
	
	public static void main(String[] args)
	{
        Scanner input = new Scanner(System.in);
        System.out.println("Quanto você deseja depositar na sua conta?");
        double saldoInicial = input.nextDouble();

        ContaBancaria conta = new ContaBancaria(saldoInicial);
        int opcao;

        System.out.println("Bem-vindo! Escolha a opção que deseja!");

        while (true) {
            System.out.println("==============================");
            System.out.println("0 - SAIR");
            System.out.println("1 - CONSULTAR SALDO");
            System.out.println("2 - CONSULTAR CHEQUE ESPECIAL");
            System.out.println("3 - DEPÓSITO");
            System.out.println("4 - SAQUE");
            System.out.println("5 - PAGAR BOLETO");
            System.out.println("==============================");

            opcao = input.nextInt();

            switch (opcao) {
                case 0:
                    System.out.println("Volte sempre!");
                    return;
                case 1:
                    double saldo = conta.consultarSaldo();
                    System.out.println("Saldo da conta: " + saldo);
                    break;
                case 2:
                    double chequeEspecial = conta.consultarChequeEspecial();
                    System.out.println("Cheque especial: " + chequeEspecial);
                    break;
                case 3:
                    System.out.println("==============================");
                    System.out.println("Selecione um valor:");
                    System.out.println("0 - CANCELAR");
                    System.out.println("1 - R$50.00");
                    System.out.println("2 - R$100.00");
                    System.out.println("3 - R$200.00");
                    System.out.println("4 - R$300.00");
                    System.out.println("==============================");

                    int opcaoDeposito;

                    while (true) {
                        opcaoDeposito = input.nextInt();

                        if (opcaoDeposito == 0) {
                            break;
                        }

                        if (opcaoDeposito != 1 && opcaoDeposito != 2 && opcaoDeposito != 3 && opcaoDeposito != 4) {
                            System.out.println("Selecione uma opção válida.");
                            continue;
                        }

                        switch (opcaoDeposito) {
                            case 1 -> conta.depositarDinheiro(50.00);
                            case 2 -> conta.depositarDinheiro(100.00);
                            case 3 -> conta.depositarDinheiro(200.00);
                            case 4 -> conta.depositarDinheiro(300.00);
                        }

                        if (conta.consultarTaxaChequeEspecial() != 0 && conta.consultarSaldo() > conta.consultarTaxaChequeEspecial()) {
                            System.out.println("Cobrança automática de taxa de cheque especial:");
                            System.out.println("Valor a ser pago: " + conta.consultarTaxaChequeEspecial());

                            conta.pagarTaxaChequeEspecial();
                        }

                        System.out.println("Saldo da conta: " + conta.consultarSaldo());
                    }

                    break;
                case 4:
                    System.out.println("==============================");
                    System.out.println("Selecione uma opção de saque:");
                    System.out.println("0 - CANCELAR");
                    System.out.println("1 - R$50.00");
                    System.out.println("2 - R$100.00");
                    System.out.println("3 - R$200.00");
                    System.out.println("4 - R$300.00");
                    System.out.println("==============================");

                    int opcaoSaque;

                    while (true) {
                        opcaoSaque = input.nextInt();

                        if (opcaoSaque == 0) {
                            break;
                        }

                        if (opcaoSaque != 1 && opcaoSaque != 2 && opcaoSaque != 3 && opcaoSaque != 4) {
                            System.out.println("Selecione uma opção válida.");
                            continue;
                        }

                        switch (opcaoSaque) {
                            case 1 -> conta.sacarDinheiro(50);
                            case 2 -> conta.sacarDinheiro(100);
                            case 3 -> conta.sacarDinheiro(200);
                            case 4 -> conta.sacarDinheiro(300);
                        }

                        System.out.println("Saldo da conta: " + conta.consultarSaldo());
                    }

                    break;
                case 5:
                    System.out.println("Digite o valor do boleto a ser pago:");
                    double valorBoleto;

                    while (true) {
                        valorBoleto = input.nextDouble();

                        if (valorBoleto > conta.consultarSaldo() && valorBoleto > (conta.consultarSaldo() + conta.consultarChequeEspecial())) {
                            System.out.println("Seu saldo não é suficiente para efetuar o pagamento.");
                        }

                        if (valorBoleto > conta.consultarSaldo()) {
                            double chequeEspecialAtualizado = (conta.consultarSaldo() + conta.consultarChequeEspecial()) - valorBoleto;
                            double taxaChequeEspecial = chequeEspecialAtualizado * 0.20;

                            conta.atualizarSaldo(0);
                            conta.atualizarChequeEspecial(chequeEspecialAtualizado);
                            conta.atualizarTaxaChequeEspecial(taxaChequeEspecial);
                        }

                        if (valorBoleto <= conta.consultarSaldo()) {
                            double saldoAtualizado = conta.consultarSaldo() - valorBoleto;
                            conta.atualizarSaldo(saldoAtualizado);
                        }

                        System.out.println("Saldo da conta: " + conta.consultarSaldo());
                        System.out.println("Cheque especial: " + conta.consultarChequeEspecial());
                        break;
                    }
            }
        }
    }
}
