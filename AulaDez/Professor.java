package AulaDez;

public class Professor extends Pessoa{
    private String especialidade;
    private float salario;

    public void receberAumento(float aumento) {
        this.salario += aumento; 
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public String setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
        return especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public float setSalario(float salario) {
        this.salario = salario;
        return salario;
    }
}
