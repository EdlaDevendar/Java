public class Swapping {
    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        // a = b;
        // b = a;
        // a = ++b;
        // b = --a;
        // a = ++b;
        int s = a;
        a = b;
        b = s;
        System.out.println(a);
        System.out.println(b);
    }
}