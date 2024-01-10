
class methods {
    public int methodexamples() {
        System.out.println("sucessfully completed creations of two methods");
        return 0;
    }

    // public String methodexample2(int cost)
    public String methodexample2() {
        // System.out.println("sucessfully completed creations of two
        // methodszzzzzzzzzz");
        // if (cost >= 19) {

        // return "dad";
        // } else {
        // return "dev";
        return "dev";
    }
}

public class Twomethods {
    public static void main(String[] args) {
        methods ms = new methods();
        ms.methodexamples();
        // String str = ms.methodexample2(66);
        String str = ms.methodexample2();
        System.out.println(str);
    }

}
