package fr.epsi.banque.entites;

public class Credit extends Operation{

    public Credit(String dateOperation, double montantOperation) {
        super(dateOperation, montantOperation);
    }

    @Override
    public String afficherType() {
        return "Credit";
    }

    @Override
    public String toString() {
        return super.toString();
    }
//    public String toString() {
//        return "Credit{}"+" "+ super.toString();
//    }
}
