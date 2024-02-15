package fr.epsi.banque.entites;

public class Debit extends Operation{
    public Debit(String dateOperation, double montantOperation) {
        super(dateOperation, montantOperation);
    }

    @Override
    public String afficherType() {
        return "Debit";
    }

    @Override
    public String toString() {
        return super.toString();
    }
//    public String toString() {
//        return "Debit{}"+" "+ super.toString();
//    }
}
