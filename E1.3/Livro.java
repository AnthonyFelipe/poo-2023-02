public class Livro{
    private String titulo;
    private String autor;
    private int ano;
    private String editora;
    
    public Livro(String titulo, String autor, int ano, String editora) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.editora = editora;
    }
    
    //TITULO.
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String novoTitulo){
        titulo = novoTitulo;
    }
    
    //AUTOR.
    public String getAutor(){
        return autor;
    }
    public void setAutor(String novoAutor){
        autor = novoAutor;
    }
    
    //ANO.
    public int getAno(){
        return ano;
    }
    public void setAno(int novoAno){
        ano = novoAno;
    }
    
    //EDITORA
    public String getEditora(){
        return editora;
    }
    public void setEditora(String novoEditora){
        editora = novoEditora;
    }
}
