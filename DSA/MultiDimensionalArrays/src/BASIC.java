public class BASIC {
    static void main() {
        int[][] arr = {{3, 1, 1, 2}, {1, 2, 3, 6}, {2, 3, 6, 4}};
        int n = arr.length;
        int z = arr[0].length;
        int row=-1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < z; j++) {
                sum += arr[i][j];
            }
            if(sum>max){
                max=sum;
                row=i;
            }

        }
        System.out.println(row+" "+max);
    }
}
