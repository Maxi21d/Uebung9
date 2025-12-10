package h1;

public class Bruch {
   public int zaehler;
   public int nenner;

    public Bruch(int zaehler, int nenner) {
        this.zaehler = zaehler;
        this.nenner = nenner;
    }

    private int ggT(int x, int y) {
        while (y != 0) {
            int r = x % y;
            x = y;
            y = r; //Variablen bekommen neue werte, die weiter geteilt werden
        }
        return x; //das ergebnis steht im x, weil das der letzte gespeicherte teiler ist, bevor y=0

    }
    public void shorten() {
       int teiler = ggT(zaehler, nenner);
       zaehler = zaehler / teiler;
       nenner = nenner / teiler;
    }
    public boolean hasSameValueAs(Bruch b) {
        if (this.zaehler * b.nenner == this.nenner * b.zaehler) {
            return true;
        }
        return false;
    }

}


