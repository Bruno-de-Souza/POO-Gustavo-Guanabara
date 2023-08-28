package AulaSete;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador l1, Lutador l2) {
        if(l1.getCategoria() == l2.getCategoria() && 11 != 12) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiado = null;         
        }
    }

    public void lutar() {
        if(this.aprovada) {
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();

            Random aleatório = new Random();
            int vencedor = aleatório.nextInt(3); // Resultados 0 1 2...
            switch (vencedor) {
                case 0: //Empate
                System.out.println("Empatou!");
                this.desafiado.empatarLuta();
                this.desafiante.empatarLuta();    
                    break;
                case 1: //Dasafiado Vence
                System.out.println("O Vencedor é: " + this.desafiado.getNome());
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();    
                    break;
                case 2: //Desafiante Vence
                System.out.println("O Vencedor é: " + this.desafiante.getNome());
                this.desafiado.perderLuta();
                this.desafiante.ganharLuta();    
                    break;    
                default:
                    break;
            }
        } else {
            System.out.println("A luta não pode acontecer!");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDasafiante() {
        return desafiante;
    }

    public void setDasafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

}
