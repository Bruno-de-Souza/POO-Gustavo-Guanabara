package AulaOnze;

public class Aula011 {
    public static void main(String[] args) {
        // Main class
        
        // Pessoa p1 = new Pessoa(); // Cannot instantiate the type Pessoa - abstract class
        //Visitante v1 = new Visitante(); // Visitante is a subclass of Pessoa - concrete class
        //v1.setNome("Pedro");   
        //v1.setIdade(10);
        //v1.setSexo("Masculino");
        //System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("Raissa");
        a1.setIdade(18);
        a1.setSexo("Feminino");
        a1.setCurso("Programação");
        a1.setMatricula(123456);
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setNome("Jubileu");
        b1.setMatricula(1112);
        b1.setBolsa(0.5f);
        b1.pagarMensalidade();

        Professor p1 = new Professor();
        p1.setNome("Guanabara");
        p1.setIdade(40);
        p1.setSexo("Masculino");
        p1.setSalario(2500f);
        p1.receberAumento(550.20f);

        Tecnico t1 = new Tecnico();
        t1.setNome("Maria");
        t1.setIdade(30);
        t1.setSexo("Feminino");
        t1.setCurso("Programação");
        t1.setMatricula(123456);
        t1.praticar();

    }
}
