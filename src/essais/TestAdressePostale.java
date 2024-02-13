package essais;

import entites.AdressePostale;

public class TestAdressePostale {
    public static void main(String[] args) {
        AdressePostale a = new AdressePostale();
        a.numeroRue = 5;
        a.libelleRue = "des Maréchaux";
        a.codePostal = 44100;
        a.ville = "Nantes";

        AdressePostale b = new AdressePostale();
        b.numeroRue = 85;
        b.libelleRue = "d’Antrain";
        b.codePostal = 35700;
        b.ville = "Rennes";
    }

}
