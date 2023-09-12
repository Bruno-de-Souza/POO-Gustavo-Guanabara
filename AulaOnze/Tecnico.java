package AulaOnze;

public class Tecnico extends Aluno {
    private int registroProfissional;

    public void praticar() {
        System.out.println(this.getNome() + " está praticando!");
    }

    public int getRegistroProfissional() {
        return this.registroProfissional;
    }

    public int setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
        return registroProfissional;
    }
}
