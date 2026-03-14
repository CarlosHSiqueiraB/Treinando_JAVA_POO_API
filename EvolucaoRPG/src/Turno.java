import java.util.ArrayList;

public class Turno {
    public static void main(String[] args) {
        ArrayList<Personagens> equipe = new ArrayList<>();
        equipe.add(new Guerreiro("Pedro"));
        equipe.add(new Guerreiro("Ronaldo"));
        equipe.add(new Mago("Vitória"));

        for (Personagens personagem : equipe) {
            personagem.atacar();
        }
    }
}