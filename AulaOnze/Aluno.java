package AulaOnze;

public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    public void pagarMensalidade() {
        System.out.println(this.getNome() + "! Mensalidade está paga!");
    }

    public int getMatricula() {
        return this.matricula;
    }

    public int setMatricula(int matricula) {
        this.matricula = matricula;
        return matricula;
    }

    public String getCurso() {
        return this.curso;
    }

    public String setCurso(String curso) {
        this.curso = curso;
        return curso;
    }
}
