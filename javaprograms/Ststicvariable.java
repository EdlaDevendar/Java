public class Ststicvariable {
    String brand;
    int price;
    static String name;

    public void show() {
        System.out.println(brand + ":" + price + ":" + name);
    }

    static void show1(Ststicvariable obj) {
        System.out.println(obj.brand + ":" + obj.price + ":" + name);
    }

    public static void main(String[] args) {

        Ststicvariable st = new Ststicvariable();
        st.brand = "apple";
        st.price = 1200;
        Ststicvariable.name = "smartphone";
        Ststicvariable st1 = new Ststicvariable();
        st1.brand = "onepluse";
        st1.price = 1330;
        Ststicvariable.name = "smartphone";
        st.show();
        Ststicvariable.show1(st1);
    }
}