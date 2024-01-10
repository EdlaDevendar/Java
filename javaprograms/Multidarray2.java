public class Multidarray2 {
    public static void main(String[] args) {

        // int array[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 6, 7, 8 } };
        int array1[][] = new int[4][3];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                int d = (int) (Math.random() * (10));
                System.out.print(d + " ");
            }
            System.out.println();
        }

        // System.out.println(array1[2][1]);
    }

}
