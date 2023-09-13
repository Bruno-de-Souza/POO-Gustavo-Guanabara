package AulaDoze;

public class Mamifero extends Animal {
    private String corPelo;

    @Override
    public void locomover() {
        System.out.println("Correndooo...");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamandooo...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamíferooo...");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public String setCorPelo(String corPelo) {
        this.corPelo = corPelo;
        return corPelo;
    }
}
