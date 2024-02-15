package fr.epsi.banque.entites;

public abstract class Operation {
    private String dateOperation;

    private double montantOperation;

    public Operation(String dateOperation, double montantOperation) {
        this.dateOperation = dateOperation;
        this.montantOperation = montantOperation;
    }
    public abstract String afficherType();

    @Override
    public String toString() {
        return "Operation{" +
                "dateOperation='" + dateOperation + '\'' +
                ", montantOperation=" + montantOperation +
                '}';
    }

    public String getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(String dateOperation) {
        this.dateOperation = dateOperation;
    }

    public double getMontantOperation() {
        return montantOperation;
    }

    public void setMontantOperation(double montantOperation) {
        this.montantOperation = montantOperation;
    }
}
