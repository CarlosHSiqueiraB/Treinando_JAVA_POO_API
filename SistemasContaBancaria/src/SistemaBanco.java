import java.util.Scanner;

public class SistemaBanco {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seja bem vindo ao Banco!");
        System.out.println("Digite o nome do titular da conta:");
        String titular = scanner.nextLine();
        System.out.println("Digite o número da conta:");
        String numeroConta = scanner.nextLine();
        System.out.println("Digite o saldo inicial da conta:");
        double saldoInicial = scanner.nextDouble();
        scanner.nextLine();

        ContaBancaria conta = new ContaBancaria(titular, saldoInicial, numeroConta); // Cria a conta bancaria
        System.out.println("Conta criada com sucesso!");
        System.out.println("Digite o valor para depósito:");
        double valorDeposito = scanner.nextDouble();
        scanner.nextLine();
        conta.depositar(valorDeposito);
        System.out.println("Saldo após depósito: " + conta.getSaudo());
        System.out.println("Digite o valor para saque:");
        double valorSaque = scanner.nextDouble();
        scanner.nextLine();
        conta.sacar(valorSaque);
        System.out.println("Saldo após saque: " + conta.getSaudo());
        System.out.println("Digite o valor para transferência:");
        double valorTransferencia = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Digite o número da conta de destino:");
        String numeroContaDestino = scanner.nextLine();
        ContaBancaria contaDestino = new ContaBancaria("Destinatário", 0, numeroContaDestino);
        conta.transferir(valorTransferencia, contaDestino);
        System.out.println("Saldo após transferência: " + conta.getSaudo());
        System.out.println("Saldo da conta de destino: " + contaDestino.getSaudo());
        scanner.close();
    }
}
