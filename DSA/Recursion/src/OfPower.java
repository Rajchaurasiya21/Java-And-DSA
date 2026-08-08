import java.util.*;
public class OfPower {
   public static void main(String[] Args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Number");
        int x=sc.nextInt();
        System.out.println("Enter Pow  Number");
        int y=sc.nextInt();
        System.out.println(pow(x,y));

    }

    public static  int pow(int x,int y) {
        if (y <= 0) return 1;
        int call = pow(x, y / 2);
        if (y % 2 == 0) return call*call;
        else return x*call*call;

    }
}
