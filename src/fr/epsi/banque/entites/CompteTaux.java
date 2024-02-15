package fr.epsi.banque.entites;

public class CompteTaux extends Compte {

    private double txRemuneration;


    public CompteTaux(int numeroCompte, int soldeCompte, double txRemuneration) {
        super(numeroCompte, soldeCompte);
        this.txRemuneration = txRemuneration;
    }

    @Override
    public String toString() {
        return super.toString() +" "+"CompteTaux{" +
                "txRemuneration=" + txRemuneration +
                '}';
    }
}
