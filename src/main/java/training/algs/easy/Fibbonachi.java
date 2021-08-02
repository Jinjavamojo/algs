package training.algs.easy;

public class Fibbonachi {

    /**
     * Calculate nth Fibbonachi number
     * Fibbonachi numbers row example - 0,1,1,2,3,5,8
     * @param n - position of number that we'are going to calculate
     * @return calculated number
     */
    public static int getNthFib(int n) {
        int m1 = 0;
        int m2 = 1;
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        for (int i = 3; i <= n; i++) {
            int temp = m1 + m2;
            m1 = m2;
            m2 = temp;
        }
        return m2;
    }
}
