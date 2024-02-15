package fr.epsi.banque;

import fr.epsi.banque.entites.Operation;
import fr.epsi.banque.entites.Debit;
import fr.epsi.banque.entites.Credit;

public class TestOperation {
    public static void main(String[] args) {
        Operation [] operations = {new Debit("15/05/2023",200),new Credit("23/02/2024",300),new Credit("18/02/2024",55),new Debit("26/02/2024",100)
        };
        double solde =0;
        for (Operation operation : operations ){

            if (operation.afficherType().equals("Debit")){
                solde -=operation.getMontantOperation();
            }
            else {
                solde +=operation.getMontantOperation();
            }
////                System.out.println(operation.afficherType()+" "+operation.getDateOperation()+" "+"-"+operation.getMontantOperation()+" "+ "euros");
//            System.out.printf("%s effectué le %s de -%s euros \n",operation.afficherType(),operation.getDateOperation(),operation.getMontantOperation());
//            }
//            else {
//                System.out.printf("%s effectué le %s de +%s euros\n",operation.afficherType(),operation.getDateOperation(),operation.getMontantOperation());
////                System.out.println(operation.afficherType()+" "+operation.getDateOperation()+" "+"+"+operation.getMontantOperation()+" "+ "euros");
//            }

            System.out.printf("%s effectué le %s de %s euros,le solde de votre compte est de %s euros\n",operation.afficherType(),operation.getDateOperation(),operation.getMontantOperation(),solde);
        }
        System.out.println(solde);
    }
}
