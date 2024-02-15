package fr.epsi.banque;

import fr.epsi.banque.entites.Compte;
import fr.epsi.banque.entites.CompteTaux;

public class TestBanque {
    public static void main(String[] args) {
//        Compte compte = new Compte(51545637,2500);
//        System.out.println(compte);

        Compte [] comptes = {new Compte(1234564564,7500),new CompteTaux(58645354,2500,2.5)};
        for (int i = 0; i < comptes.length ; i++) {
            System.out.println(comptes[i]);
        }
    }
}
