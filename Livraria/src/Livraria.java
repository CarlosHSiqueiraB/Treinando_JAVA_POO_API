public class Livraria {

    protected String titulo;
    protected String autor;
    protected int disponivel;

    public Livraria(String titulo, String autor, int disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;
    }

    public void emprestar() {
        if (disponivel <= 0) {
            System.out.println("Livro Indisponivel");
        } else {
            System.out.println("Livro Emprestado");
            disponivel--;
        }
    }

    public void devolver() {
            System.out.println("Livro Devolvido");  
            disponivel++;
        }

}

