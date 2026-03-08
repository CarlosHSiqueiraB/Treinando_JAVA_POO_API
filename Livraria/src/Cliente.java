public class Cliente {
    public static void main(String[] args) {

        Livraria livro = new Livraria("Java Básico", "Carlos", 3);

        livro.emprestar();
        livro.devolver();
    }
}

