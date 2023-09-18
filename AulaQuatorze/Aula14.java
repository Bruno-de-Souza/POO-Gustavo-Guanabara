package AulaQuatorze;

public class Aula14 {
    public static void main(String[] args) {
        // Main class
        Video v[] = new Video[3];
        v[0] = new Video("Aula de POO em Java");
        v[1] = new Video("Aula de PHP");
        v[2] = new Video("Aula de JavaScript");

        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());

        Gafanhato g[] = new Gafanhato[2];
        g[0] = new Gafanhato("Jubileu", 22, "M", "juba");
        g[1] = new Gafanhato("Creuza", 12, "F", "creuzita");

        System.out.println(g[0].toString());
        System.out.println(g[1].toString());

        
    }
}
