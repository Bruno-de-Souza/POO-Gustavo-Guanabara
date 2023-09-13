package AulaDoze;

public class Ave extends Animal{
    private String corPena;

    @Override
    public void locomover() {
        System.out.println("Voandooo...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendooo frutas...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave...");
    }

    public void fazerNinho() {
        System.out.println("Construiu um ninhooo...");
    }

    public String getCorPena() {
        return corPena;
    }

    public String setCorPena(String corPena) {
        this.corPena = corPena;
        return corPena;
    }
}
