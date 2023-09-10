package AulaDez;

public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    public void cancelarMatricula() {
        System.out.println("Matrícula será cancelada.");
    }

    public int getMatricula() {
        return matricula;
    }

    public int setMatricula(int matricula) {
        this.matricula = matricula;
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public String setCurso(String curso) {
        this.curso = curso;
        return curso;
    }
}
