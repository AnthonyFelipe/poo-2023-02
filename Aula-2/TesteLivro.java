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
