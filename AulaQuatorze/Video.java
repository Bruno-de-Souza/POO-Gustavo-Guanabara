package AulaQuatorze;

public class Video implements AcoesVideo {
    protected String titulo;
    protected int avaliacao;
    protected int views;
    protected int curtidads;
    protected boolean reproduzindo;

    @Override
    public void play() {

    }
    @Override
    public void pause() {

    }
    @Override
    public void like() {

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
        this.avaliacao = avaliacao;
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
}
