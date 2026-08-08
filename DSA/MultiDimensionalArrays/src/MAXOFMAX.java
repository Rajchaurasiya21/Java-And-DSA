public class MAXOFMAX {
    static void main() {
        int[][] arr = {{3, 1, 1, 2}, {1, 2, 3, 6}, {2, 3, 1, 4}};
        int n = arr.length;
        int z = arr[0].length;
        int row = -1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int Submax = Integer.MIN_VALUE;
            for (int j = 0; j < z; j++) {
                if (arr[i][j] > Submax) {
                    Submax = arr[i][j];
                }
            }
            System.out.println(Submax);
            if (Submax > max) {
                max = Submax;
                row = i;

            }
        }
        System.out.println("Max Of Array max "+max);
    }
}
