package AulaQuatorze;

public class Aula14 {
    public static void main(String[] args) {
        // Main class
        Video v[] = new Video[3];
        v[0] = new Video("Aula de POO em Java");
        v[1] = new Video("Aula de PHP");
        v[2] = new Video("Aula de JavaScript");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
        g[1] = new Gafanhoto("Creuza", 12, "F", "creuzita");
        
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        vis[1] = new Visualizacao(g[0], v[0]);
        vis[1].avaliar(20.0f);
        System.out.println(vis[1].toString());
        vis[2] = new Visualizacao(g[1], v[2]);
        vis[2].avaliar(98.0f);
        System.out.println(vis[2].toString());
        /*System.out.println("Videos\n-------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("Gafanhotos\n------------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());*/
    }
}
