package AulaDoze;

public abstract class Animal {
    protected float peso;
    protected int idade;
    protected int membros;

    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

    public float getPeso() {
        return peso;
    }

    public float setPeso(float peso) {
        this.peso = peso;
        return peso;
    }

    public int getIdade() {
        return idade;
    }

    public int setIdade(int idade) {
        this.idade = idade;
        return idade;
    }

    public int getMembros() {
        return membros;
    }

    public int setMembros(int membros) {
        this.membros = membros;
        return membros;
    }
}


