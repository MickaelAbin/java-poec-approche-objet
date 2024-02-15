package fr.epsi.banque.entites;

public class Compte {
    int numeroCompte;

    int soldeCompte;

    @Override
    public String toString() {
        return "Compte{" +
                "numeroCompte=" + numeroCompte +
                ", soldeCompte=" + soldeCompte +
                '}';
    }

    public Compte(int numeroCompte, int soldeCompte) {
        this.numeroCompte = numeroCompte;
        this.soldeCompte = soldeCompte;


    }
}
