public class ContaBancaria {
    private String titular;
    private double saudo;
    private String numeroConta;

    public ContaBancaria(String titular, double saudo, String numeroConta) {
        this.titular = titular;
        this.saudo = saudo;
        this.numeroConta = numeroConta;
    }

    public void depositar(double valor) {
        if (valor>0) {
          saudo += valor;  
        } else {
            System.out.println("Valor de depósito deve ser positivo.");
        }
        
    }

    public void sacar(double valor){
        if (valor > saudo) {
            System.out.println("Saldo insuficiente para saque.");
        } else {
            saudo -= valor;
        }
    }

    public void transferir(double valor, ContaBancaria destino){
        if (valor > saudo) {
            System.out.println("Saldo insuficiente para transferência.");
        } else {
            this.sacar(valor);
            destino.depositar(valor);
        }
    }

    public double getSaudo() {
        return saudo;
    }
}
