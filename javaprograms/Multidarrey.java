public class Multidarrey {
    public static void main(String[] args) {
        int nums[][] = { { 1, 2, 3, 33 }, { 44, 4, 5, 6 }, { 55, 7, 8, 9 } };
        // int nums[][] = new int[4][5];
        // int nums[][][] = new int[4][4][4];
        // nums[1][0]=2;

        // nums[0] = new int[4][3];
        // nums[1] = new int[3][3];
        // nums[2] = new int[2][3];
        // nums[3] = new int[5][3];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                // for (int k = 0; k < nums[j].length; k++) {
                // nums[i][j][k] = (int) (Math.random() * 10);
                // System.out.print(nums[i][j][k] + " ");
                System.out.print(nums[i][j] + " ");
                // }
                // System.out.println();
            }
            System.out.println();
        }
    }

    /*
     * for (int n[] : nums) {
     * for (int m : n )
     * m = (int) (Math.random() * 10);
     * System.out.print(m + " ");
     * }
     * System.out.println();
     * }
     * }
     */

}
