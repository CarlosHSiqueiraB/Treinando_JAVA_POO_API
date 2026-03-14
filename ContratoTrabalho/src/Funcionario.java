public abstract class Funcionario {
    protected String nome;
    protected double salariob;

    public Funcionario(String nome, double salariob) {
        this.nome = nome;
        this.salariob = salariob;
    }
    public abstract double getSalario();

    public abstract String getNome();
}


