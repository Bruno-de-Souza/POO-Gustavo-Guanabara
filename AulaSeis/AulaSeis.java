package AulaSeis;

public class AulaSeis {
    public static void main (String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.maisVolume();
        c.ligarMudo();
        c.play();
        c.abrirMenu();
        c.fecharMenu();
    }
}
