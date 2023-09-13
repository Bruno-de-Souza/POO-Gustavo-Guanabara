package AulaDoze;

public class AulaDoze {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Ave a = new Ave();
        

        m.setPeso(85.3f);
        m.setIdade(2);
        m.setMembros(4);
        m.setCorPelo("Marrom");

        r.setPeso(10.5f);
        r.setIdade(1);
        r.setMembros(4);
        r.setCorEscama("Verde");

        a.setPeso(0.89f);
        a.setIdade(2);
        a.setMembros(2);
        a.setCorPena("Branca");

        m.locomover();
        m.alimentar();
        m.emitirSom();

        r.locomover();
        r.alimentar();
        r.emitirSom();

        a.locomover();
        a.alimentar();
        a.emitirSom();
    }
}
