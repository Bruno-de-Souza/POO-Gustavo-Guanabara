package AulaSeis;

public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private int setVolume(int volume) {
        this.volume = volume;
        return volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private boolean setLigado(boolean ligado) {
        this.ligado = ligado;
        return ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private boolean setTocando(boolean tocando) {
        this.tocando = tocando;
        return tocando; 
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("----- MENU -----");
        System.out.println("Está Ligado? " + this.getTocando());
        System.out.println("Está Tocando? " + this.getTocando());
        System.out.print("Volume: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i += 10) {
            System.out.println("|");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 5);
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 5);
        }
    }

    @Override
    public void ligarMudo() {
        if (getLigado() && getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (getLigado() && getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        }
    }
}
