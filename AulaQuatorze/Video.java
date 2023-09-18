package AulaQuatorze;

public class Video implements AcoesVideo {
    protected String titulo;
    protected int avaliacao;
    protected int views;
    protected int curtidads;
    protected boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidads = 0;
        this.reproduzindo = false;
    }   

    @Override
    public void play() {
        this.reproduzindo = true;
    }
    @Override
    public void pause() {
        this.reproduzindo = false;
    }
    @Override
    public void like() {
        this.curtidads ++ ;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String setTitulo(String titulo) {
        this.titulo = titulo;
        return titulo;
    }

    public int getAvalicao() {
        return this.avaliacao;
    }

    public int setAvaliacao(int avaliacao) {
        int nova;
        nova = ((this.avaliacao + avaliacao) / this.views);
        this.avaliacao = nova;
        return avaliacao;
    }

    public int getViews() {
        return this.views;
    }

    public int setViews(int views) {
        this.views = views;
        return this.views;
    }

    public int getCurtidas() {
        return this.curtidads;
    }

    public int setCurtidas(int curtidads) {
        this.curtidads = curtidads;
        return this.curtidads;
    }

    public boolean getReproduzindo() {
        return this.reproduzindo;
    }

    public boolean setReproduzindo(Boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
        return this.reproduzindo;
    }

    @Override
    public String toString() {
        return "Video { " + "Titulo = " + titulo + ", Avaliacao = " + avaliacao + ", Views = " + views + ", Curtidas = " + curtidads + ", Reproduzindo = " + reproduzindo + " }\n";
    }
}
