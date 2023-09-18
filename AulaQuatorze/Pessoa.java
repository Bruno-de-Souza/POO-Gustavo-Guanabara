package AulaQuatorze;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    private float experiencia;

    public void gaharaExperiencia() {
        this.setExperiencia(experiencia + 1);
    }

    public Pessoa(String nome, int idade, String sexo) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
        this.experiencia = 0;
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

    public float getExperiencia() {
        return this.experiencia;
    }

    public float setExperiencia(float experiencia) {
        this.experiencia = experiencia;
        return experiencia;
    }

    @Override
    public String toString() {
        return " Pessoa { " +
            " nome = '" + getNome() + "'" +
            ", idade = '" + getIdade() + "'" +
            ", sexo = '" + getSexo() + "'" +
            ", experiencia = '" + getExperiencia() + "'" +
            " } ";
    }
}
