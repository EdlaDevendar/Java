class swaping {
    public int swapmethod(int a, int b) {
        int add = a + b;
        return add;
        // System.out.println(add);
    }
}

public class Callingvalu {
    public static void main(String[] args) {
        // int num1 = 22;
        // int num2 = 44;
        swaping s = new swaping();
        // int addition = s.swapmethod(1, 2);
        System.out.println(s.swapmethod(1, 2));
        // System.out.println(addition);
        // s.swapmethod(num1, num2);
    }

}
