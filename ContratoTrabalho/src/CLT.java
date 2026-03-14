public class CLT extends Funcionario implements Tributavel{

    public CLT(String nome, double salariob) {
        super(nome, salariob);
    }

    @Override
    public double getSalario(){
        return this.salariob;
    }

    @Override
    public String getNome(){
        return this.nome;
    }

    @Override
    public double calcularImposto(){
        return this.getSalario()*0.11;
    }
}
