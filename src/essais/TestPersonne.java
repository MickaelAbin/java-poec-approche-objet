package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {
    public static void main(String[] args) {
//        Personne p = new Personne();
//        p.nom = "Abin";
//        p.prenom = "Mickael";
//        p.adressePostale = new AdressePostale();
//        p.adressePostale.codePostal = 44400;
//        p.adressePostale.numeroRue = 99;
//        p.adressePostale.libelleRue = " Maurice Jouaud";
//        p.adressePostale.ville = " Rezé";
//
//        Personne p2 = new Personne();
//        p2.nom = "Coisy";
//        p2.prenom = "Aurelie";
//        p2.adressePostale = new AdressePostale();
//        p2.adressePostale.codePostal = 44400;
//        p2.adressePostale.numeroRue = 99;
//        p2.adressePostale.libelleRue = " Maurice Jouaud";
//        p2.adressePostale.ville = "Rezé";

        Personne p = new Personne("Abin", "Mickael", new AdressePostale(99, "Rue Maurice Jouaud", 44400, "Rezé"));
        Personne p2 = new Personne("Coisy", "Aurelie");
        p.affichageNomPrenom();
        System.out.println(p.getAdressePostale());
//      p.setAdressePostale(new AdressePostale(5));
        System.out.println(p.getAdressePostale());
        System.out.println(p.getAdressePostale().getVille());
    }
}

