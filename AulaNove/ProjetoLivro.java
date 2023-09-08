package AulaNove;

public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa( "Larissa", 28, "Feminino");
        p[1] = new Pessoa("Luciana", 38, "Feminino");
        l[0] = new Livro("Aprendendo Java", "Paulo De Tarcio", 370, 0, false, p[0]);
        l[1] = new Livro("Poo para programadores iniciantes", "Gustavo Guanabara", 400, 0, false, p[1]);
        l[2] = new Livro("JavaScript", "Mozzila MDN", 500, 0, false, p[0]);


        l[0].abrir();
        l[0].folhear();
        System.out.println(l[0].detalhes());
    }
}
