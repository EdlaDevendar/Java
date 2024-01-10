public class Stringrevers {
    public static void main(String[] args) {
        /*
         * String s = "devendar";
         * int i = s.length();
         * while (i > 0) {
         * System.out.print(s.charAt(i - 1));
         * i--;
         * 
         * }
         * System.out.println();
         */
        String se = "computer";
        for (int i = se.length(); i > 0; --i) {
            System.out.print(se.charAt(i - 1));
        }
        System.out.println();

    }
}
