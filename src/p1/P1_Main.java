package p1;

public class P1_Main {
    public static void main(String[] args) {
        System.out.println(getNumber(50));

    }
    public static int getNumber(int a) {
        return a > 42 ? 42 : 0;
    }
}
