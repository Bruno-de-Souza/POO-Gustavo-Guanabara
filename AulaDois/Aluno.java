package AulaDois;

public class Aluno {
    String nome;    
    int idade;
    String curso;
    boolean presente;


void status(){
    System.out.println("Nome: " + this.nome);
    System.out.println("Idade: " + this.idade);
    System.out.println("Curso: " + this.curso);
    System.out.println("Presente: " + this.presente);
}

void presenca(){
    if(this.presente == true){
        System.out.println("Presente");
    } else {
        System.out.println("Faltou");
    }
  }

}
