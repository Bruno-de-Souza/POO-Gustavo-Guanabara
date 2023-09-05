package AulaNove;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totalPaginas, int paginaAtual, boolean aberto, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.paginaAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    public String getTitulo() {
    return titulo;
    }

    public String setTitulo(String titulo) {
        this.titulo = titulo;
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String setAutor(String autor) {
        this.autor = autor;
        return autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public int setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
        return totalPaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public int setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
        return paginaAtual;
    }

    public boolean hetAberto() {
        return aberto;
    }

    public boolean setAberto(boolean aberto) {
        this.aberto = aberto;
        return aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public Pessoa setLeitor(Pessoa leitor) {
        this.leitor = leitor;
        return leitor;
    }

    public String detalhes() {
        
        return "Livro{" + "titulo=" + titulo + "\n, autor=" + autor + "\n, totalPaginas=" + totalPaginas + "\n, paginaAtual=" + paginaAtual + "\n, aberto=" + aberto + "\n, leitor=" + leitor.getNome() + '}';
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    //@Override
    public void folhear(int p) {
        if(p > this.totalPaginas){
            this.paginaAtual = 0;
        } else {
            this.paginaAtual = p; 
        }
    }

    @Override
    public void avancarPagina() {
        this.paginaAtual = paginaAtual + 1;
    }

    @Override
    public void voltarPagina() {
        this.paginaAtual = paginaAtual - 1;
    }
}
