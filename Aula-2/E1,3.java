public class Livro{
    private String titulo;
    private String autor;
    private int ano;
    private String editora;

    public Livro(String titulo, String autor, int ano, String editora){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.editora = editora;
    }
}
    
    public String toString(){
        return "Titulo: " + titulo + "\n Autor: " + autor + "\n Ano: " + ano + "\n Editora: " + editora;
    }
    
public class TestaLivro(){
    public static void main(String[] args) {
    }
}