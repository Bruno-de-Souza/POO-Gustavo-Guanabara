package AulaDoze;

public class Reptil extends Animal{
    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("Rastejandooo...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendooo vegetais...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Sooom de réptil...");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public String setCorEscama(String corEscama) {
        this.corEscama = corEscama;
        return corEscama;
    }
}
