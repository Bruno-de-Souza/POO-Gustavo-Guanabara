package AulaDez;

public class ProjetoPessoa {
    public static void main(String[] args) {
      // Main class
      Pessoa p1 = new Pessoa();
      Aluno p2 = new Aluno();
      Professor p3 = new Professor();
      Funcionario p4 = new Funcionario();

      p1.setNome("Pedro");
      p2.setNome("Maria");
      p3.setNome("Claudio");
      p4.setNome("Fabiana");

      p1.setIdade(15);
      p1.setSexo("Masculino");
      p2.setIdade(18);
      p2.setSexo("Feminino");
      p3.setIdade(35);
      p3.setSexo("Masculino");
      p4.setIdade(45);
      p4.setSexo("Feminino");

      p2.setCurso("Programação");
      p3.setSalario(2000f);
      p4.setSetor("Estoque");

      System.out.println(p1.toString());
      System.out.println(p2.toString());
      System.out.println(p3.toString());
      System.out.println(p4.toString());

      //p1.receberAumento(550.20f);
      //p2.mudarTrabalho();
      //p4.cancelarMatricula();
    }
}