public class Reverse {
    public static void reverse(int n,int r) {
        if (n == 0) {
            System.out.println(r);
            return;
        }
        reverse(n/10,(r*10)+(n%10));
    }
    public static void main(String[]args){
        int n=2456;
//        while(n!=0){
//            r*=10;
//            r+=(n%10);
//            n/=10;
            reverse(n,0);
        }
    }
