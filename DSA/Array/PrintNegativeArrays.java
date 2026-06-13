import java.util.*;
public class PrintNegativeArrays {
    static void main() {
        System.out.println("Print Negative Arrays");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size:");
        int n=sc.nextInt();
        int[] arr= new int[n];
        System.out.print("Enter Array elements:");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        // for negative
        for(int i=0; i<n;i++)
            if(arr[i]<0)
        System.out.print(arr[i]+" ");
        }

    }

