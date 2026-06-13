import java.util.*;
class max {
    static void main() {
        int arr[] = {1, 3, 4, 5};
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        int Sum = 0;
        for (int X : arr) {
            Sum += X;

        }
        int missing = sum - Sum;
        System.out.println(missing);
    }
}