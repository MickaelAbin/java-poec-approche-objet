package essais;

import entites.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        Personne p = new Personne();
        p.nom = "Abin";
        p.prenom = "Mickael";
        p.adressePostale.codePostal = 44400;
        p.adressePostale.numeroRue = 99;
        p.adressePostale.libelleRue = " Maurice Jouaud";
        p.adressePostale.ville = "Rezé";

        Personne p2 = new Personne();
        p2.nom = "Coisy";
        p2.prenom = "Aurelie";
        p2.adressePostale.codePostal = 44400;
        p2.adressePostale.numeroRue = 99;
        p2.adressePostale.libelleRue = " Maurice Jouaud";
        p2.adressePostale.ville = "Rezé";
    }
    }
