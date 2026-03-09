public class ContaBancaria {
    private String titular;
    private double saldo;
    private String numeroConta;

    public ContaBancaria(String titular, double saldo, String numeroConta) {
        this.titular = titular;
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    public void depositar(double valor) {
        if (valor>0) {
          saldo += valor;  
        } else {
            System.out.println("Valor de depósito deve ser positivo.");
        }
        
    }

    public void sacar(double valor){
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque.");
        } else {
            saldo -= valor;
        }
    }

    public void transferir(double valor, ContaBancaria destino){
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para transferência.");
        } else {
            this.sacar(valor);
            destino.depositar(valor);
        }
    }

    public double getsaldo() {
        return saldo;
    }
}
