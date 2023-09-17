package AulaQuatorze;

public class Gafanhato extends Pessoa {

    private String login;
    private int totalAssistido;

    public Gafanhato(String nome, int idade, String sexo, int experiencia) {
        super(nome, idade, sexo, experiencia);
    }

    public void viuMaisUm() {
        this.setTotalAssistido(totalAssistido + 1);
    }

    public String getLogin() {
        return this.login;
    }

    public String setLogin(String login) {
        this.login = login;
        return login;
    }

    public int getTotalAssistido() {
        return this.totalAssistido;
    }

    public int setTotalAssistido(int totalAssistido) {
        this.totalAssistido = totalAssistido;
        return totalAssistido;
    }
}
