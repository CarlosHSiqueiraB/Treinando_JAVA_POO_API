public class Mago extends Personagens{
    private int mana;

    public Mago(String nome){
        this.nome = nome;
    }
    @Override
    public void atacar() {
        System.out.println(this.nome + " lançou uma bola de fogo!");
    }
}
