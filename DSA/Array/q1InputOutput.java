import java.util.*;
public class q1InputOutput {
   static void main() {
        System.out.println("InputOutput");
//        int arr[]={1,23,56,68,68};
//        int n= arr.length;
//        for(int i=0;i<=n;i++)
//        {
//            System.out.println(arr.length+arr[i]);
       Scanner sc= new Scanner(System.in);
    int [] x= new int[7];
    for(int i=0;i<=7;i++){

        x[i]= sc.nextInt();
    }
    for (int i=0;i<=7;i++){

        System.out.print(2*x[i]+" ");
    }
        }
    }

