public class basicsOFRec {
    static void main() {
        print(5);
    }
    static void print(int n) {
        if(n==0) return;
        System.out.println(n);
        print(n-1);
    }
}
