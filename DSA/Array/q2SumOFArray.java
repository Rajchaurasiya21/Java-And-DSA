import java.util.*;
public class q2SumOFArray {
    public static void main(String[] args) {
        System.out.println("Sum of Array");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers");
        int n= sc.nextInt();
        int [] arr= new int[n];
        int sum=0;
        System.out.println("Elements");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
            // for product "*="
        }

        System.out.println("Sum= "+sum);

    }
}


