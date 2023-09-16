package AulaDoze;

public class AulaDoze {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Ave a = new Ave();
        Canguro ca = new Canguro();
        Arara ara = new Arara();
        Cachorro cho = new Cachorro();
        GoldFish gf = new GoldFish();
        Tartaruga ta = new Tartaruga();
        Peixe p = new Peixe();
        
        m.locomover();
        ca.locomover();
        ca.usarBolsa();
        ara.locomover();
        cho.locomover();
        gf.locomover();
        r.locomover();
        ta.locomover();
        ara.locomover();
        a.locomover();
        p.locomover();
    }
}
