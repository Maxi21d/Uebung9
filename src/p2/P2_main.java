package p2;

public class P2_main {
    public static void main(String[] args) {

    }
    public static String shortenToLowerCase(String input, int shortenBy) {
        if (input.length() <= shortenBy) {
            input = input.substring(0, input.length() - shortenBy);
            input = input.toLowerCase();
        }
        else {
            return "";
        }
        return input;
    }
}


/*
Fehlersuche: return [], es muss ein j definiert werden
es muss in der for schleife arr1[i] arr2[j]

 */
