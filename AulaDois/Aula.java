package AulaDois;

public class Aula {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();
        c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c1.cor = "Vermelha";
        c1.ponta = 0.7f;
        c1.destampar();
        c1.status();
        c1.rabiscar();
    }
}

