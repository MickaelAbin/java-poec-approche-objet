package entites;

public class Cercle {
    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }


    public double calculPerimetre() {
        return 2 * Math.PI * rayon;
    }

    public double calculsurface() {
        return Math.PI * Math.pow(rayon, 2);
    }
}
