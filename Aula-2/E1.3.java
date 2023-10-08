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
public class TesteLivro
{
	public static void main(String[] args) {
	    
		Livro livro1 = new Livro("O homem mais rico da Babilônia", "George S. Clason", 2017, "HarperCollins");
		Livro livro2 = new Livro("1984", "George Orwell", 2009, "Companhia de letras");
		Livro livro3 = new Livro("Eu e esse meu coração", "C. C. Hunter", 2018, "Jangada");
		
		System.out.println("LIVRO 1 \n Titulo: " + livro1.getTitulo() + "\n Autor: " + livro1.getAutor() + "\n Ano: " + livro1.getAno() + "\n Editora: " + livro1.getEditora() + "\n");
		System.out.println("LIVRO 2 \n Titulo: " + livro2.getTitulo() + "\n Autor: " + livro2.getAutor() + "\n Ano: " + livro2.getAno() + "\n Editora: " + livro2.getEditora() + "\n");
		System.out.println("LIVRO 3 \n Titulo: " + livro3.getTitulo() + "\n Autor: " + livro3.getAutor() + "\n Ano: " + livro3.getAno() + "\n Editora: " + livro3.getEditora());
	}
}
