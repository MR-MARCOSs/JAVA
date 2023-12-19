import java.util.ArrayList;

public class cadastroDeLivro {
    private String nomeLivro, gênero, autor;
    private int lancado;
    private ArrayList<String> livros = new ArrayList<String>();
    private ArrayList<String> livrosPegos = new ArrayList<String>();

    private String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    private String getGênero() {
        return gênero;
    }

    public void setGênero(String gênero) {
        this.gênero = gênero;
    }

    private String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    private int getLancado() {
        return lancado;
    }

    public void setLancado(int lancado) {
        this.lancado = lancado;
    }

    public ArrayList<String> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<String> livros) {
        this.livros = livros;
    }

    public void cadastrado(String nomeLivro) {
        livros.add(nomeLivro);
        System.out.printf("O livro %s, é o %d° cadastrado, foi lançado em %d do gênero %s de %s foi cadastrado com sucesso!", getNomeLivro(), livros.size(), getLancado(), getGênero(), getAutor());
    }

    public ArrayList<String> getLivrosPegos() {
        return livrosPegos;
    }

    public void setLivrosPegos(ArrayList<String> livrosPegos) {
        this.livrosPegos = livrosPegos;
    }

    public void remover(String nomeLivro) {
        livros.remove(nomeLivro);
        livrosPegos.add(nomeLivro);
    }

    public void devolver(String nomeLivro) {
        livros.add(nomeLivro);
        livrosPegos.add(nomeLivro);
    }

    
    
}