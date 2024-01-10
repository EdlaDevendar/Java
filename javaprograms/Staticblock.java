public class Staticblock {
    String Brand;
    int price;
    static String type;

    public Staticblock() {
        Brand = "ggdgdg";
        price = 1200;
        // type = "phone";
        System.out.println(Brand + ":" + price + ":" + type);
        // System.out.println("this is constructer");
    }

    static {
        type = "phone";
        System.out.println("this is static block");
    }

    public static void main(String[] args) throws ClassNotFoundException {

        Class.forName("Staticblock");

        // Staticblock sb = new Staticblock();
        // sb.Brand = "apple";
        // sb.price = 2333;
        /// sb.type = "smartphone";
        // Staticblock sb1 = new Staticblock();

    }

}
