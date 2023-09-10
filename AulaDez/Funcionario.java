package AulaDez;

public class Funcionario extends Pessoa{
    private String setor;
    private boolean trabalhando;

    public void mudarTrabalho() {
        this.trabalhando = !this.trabalhando;
    }

    public String getSetor() {
        return setor;
    }

    public String setSetor(String setor) {
        this.setor = setor;
        return setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public boolean setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
        return trabalhando;
    }
}
