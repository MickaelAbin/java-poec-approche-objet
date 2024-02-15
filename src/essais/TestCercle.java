package essais;

import entites.Cercle;

public class TestCercle {
    public static void main(String[] args) {
        Cercle cercle = new Cercle(5);
        Cercle cercle2 = new Cercle(6.5);

        System.out.println(cercle.calculPerimetre());
        System.out.println(cercle2.calculPerimetre());

        System.out.println(cercle.calculsurface());
        System.out.println(cercle2.calculsurface());
    }
}
