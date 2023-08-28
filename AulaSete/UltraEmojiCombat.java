package AulaSete;

public class UltraEmojiCombat {
    public static void main(String[] args) {
        Lutador l[] = new Lutador [6];
        l[0] = new Lutador  ("Pretty Boy", "França", 1.75f, 31, 81.9f, 11, 2, 1);
        l[1] = new Lutador  ("Putscript", "Brasil", 1.68f, 29, 57.8f, 14, 2, 3);
        l[2] = new Lutador("SnapShadow", "EUA", 1.65f,  25, 110f, 15, 0, 0);
        l[3] = new Lutador("Dead Code", "Austrália", 1.93f, 28, 81.6f, 13, 0, 2);
        l[4] = new Lutador("UFOCobol", "Brasil", 1.70f, 37, 119.3f, 5, 4, 3);
        l[5] = new Lutador("Nerdaart", "EUA", 1.81f, 30, 105.7f, 12, 2, 4);

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[1], l[5]);
        UEC01.lutar();
    }
}
