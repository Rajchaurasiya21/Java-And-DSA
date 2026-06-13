import java.util.*;
public class SortingOfArray {
    static void main() {
        System.out.println("Array");
        int arr[]={5,8,6,4,9};
        ascending(arr);
        Arrays.sort(arr);
        ascending(arr);
    }

    static void ascending(int[] arr) {
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

}
