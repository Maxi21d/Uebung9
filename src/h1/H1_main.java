package h1;

public class H1_main {
    public static void main(String[] args) {

        // Test 1:shorten
        System.out.println("Test 1: Kürzen");
        Bruch b1 = new Bruch(12, 16);
        // Erwartung: Nach dem Kürzen sollte das 3/4 sein

        System.out.println("Vorher: " + b1.zaehler + "/" + b1.nenner);
        b1.shorten();
        System.out.println("Nachher: " + b1.zaehler + "/" + b1.nenner);
        System.out.println();

        //Test 2: Vergleichen
        System.out.println("Test 2: Vergleichen");
        Bruch b2 = new Bruch(1, 2);
        Bruch b3 = new Bruch(2, 4); // Ist wertgleich mit 1/2
        Bruch b4 = new Bruch(1, 3); // Ist NICHT wertgleich

        boolean test1 = b2.hasSameValueAs(b3); // Sollte true sein
        boolean test2 = b2.hasSameValueAs(b4); // Sollte false sein

        System.out.println("1/2 == 2/4 ?  " + test1);
        System.out.println("1/2 == 1/3 ?  " + test2);
            }
        }



