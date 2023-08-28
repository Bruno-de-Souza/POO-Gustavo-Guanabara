package AulaDois;

public class Chamada {
    
        public static void main(String[] args) {
            Aluno a1 = new Aluno();
            a1.nome = "João";
            a1.idade = 16;
            a1.curso = "Informática";
            a1.presente = true;
            a1.status();
            a1.presenca();
    
            Aluno a2 = new Aluno();
            a2.nome = "Maria";
            a2.idade = 17;
            a2.curso = "Informática";
            a2.presente = false;
            a2.status();
            a2.presenca();
        }

}
