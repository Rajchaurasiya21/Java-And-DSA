import java.util.*;
public class missingFind {
    static void main() {
        System.out.println("Find Missing");
        int [] arr= {3,0,1};
        int n=arr.length+1;
        int sum=n*(n+1)/2;
        int Msum=0;
        for(int ele: arr){
            Msum+=ele;
        }
        int missing=sum-Msum;
        System.out.println(missing);
    }
}
