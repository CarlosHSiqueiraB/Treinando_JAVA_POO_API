public class Guerreiro extends Personagens{
    private int forca;

    public Guerreiro(String nome){
        this.nome = nome;
    }

    @Override
    public void atacar() {
        System.out.println(this.nome + " atacou com sua espada!");
    }
}
