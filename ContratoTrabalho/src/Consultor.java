public class Consultor extends Funcionario implements Tributavel{

    public Consultor(String nome, double salariob) {
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
        return this.getSalario()*0.20;
    }
}
