package AulaOnze;

public class Bolsista extends Aluno {
    private float bolsa;

    public void renovarBolsa() {
        System.out.println("Renovando bolsa de " + this.getNome());
    }

    public float getBolsa() {
        return this.bolsa;
    }

    public float setBolsa(float bolsa) {
        this.bolsa = bolsa;
        return bolsa;
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(this.getNome() + " é bolsista! Pagamento facilitado!");
    }
}
