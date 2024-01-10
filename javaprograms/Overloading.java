class load {
    public int loading(int a, int b, int c) {
        int z = a + b + c;
        return z;
    }

    public int loading(int a, int b) {
        int z = a + b;
        return z;
    }
}

public class Overloading {
    public static void main(String[] args) {
        load id = new load();
        int add = id.loading(2, 3, 77);
        System.out.println(add);
    }
}
