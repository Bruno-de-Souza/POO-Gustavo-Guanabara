package AulaOnze;

public class Professor extends Pessoa {
    private String especialidade;
    private float salario;

    public void receberAumento(float aumento) {
        this.salario = this.salario + aumento;
    }

    public String getEpecialidade9() {
        return this.especialidade;
    }

    public String setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
        return especialidade;
    }

    public float getSalario() {
        return this.salario;
    }

    public float setSalario(float salario) {
        this.salario = salario;
        return salario;
    }
}
