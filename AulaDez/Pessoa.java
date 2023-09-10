package AulaDez;

public class Pessoa {
   private String nome;
   private int idade;
   private String sexo;
   
   public void fazerAniversario() {
     this.idade = idade + 1;
   }

   public String getNome() {
        return nome;
   }

   public String setNome(String nome) {
        this.nome = nome;
        return nome;
   }

   public int getIdade() {
        return idade;
   }

   public int setIdade(int idade) {
        this.idade = idade;
        return idade;
   }

   public String getSexo() {
        return sexo;
   }

   public String setSexo(String sexo) {
        this.sexo = sexo;
        return sexo;
   }

   @Override
   public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
   }
}
