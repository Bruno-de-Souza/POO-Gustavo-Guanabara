package AulaOnze;

public abstract class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public final void fazerAniversario() {
        this.idade++;
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

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", idade='" + getIdade() + "'" +
            ", sexo='" + getSexo() + "'" +
            "}";
    }
}
