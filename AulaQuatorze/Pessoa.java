package AulaQuatorze;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    private int experiencia;

    public void gaharaExperiencia() {
        this.setExperiencia(experiencia + 1);
    }

    public Pessoa(String nome, int idade, String sexo, int experiencia) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
        this.setExperiencia(experiencia);
    }

    public String getNome() {
        return this.nome;
    }

    public String setNome(String nome) {
        this.nome = nome;
        return nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public int setIdade(int idade) {
        this.idade = idade;
        return idade;
    }

    public String getSexo() {
        return this.sexo;
    }

    public String setSexo(String sexo) {
        this.sexo = sexo;
        return sexo;
    }

    public int getExperiencia() {
        return this.experiencia;
    }

    public int setExperiencia(int experiencia) {
        this.experiencia = experiencia;
        return experiencia;
    }
}
