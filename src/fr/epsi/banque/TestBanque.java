package fr.epsi.banque;

import fr.epsi.banque.entites.Compte;

public class TestBanque {
    public static void main(String[] args) {
        Compte compte = new Compte(51545637,2500);
        System.out.println(compte);
    }
}
