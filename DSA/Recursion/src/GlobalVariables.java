public class GlobalVariables {
    static int x=10;
    static void main() {
        Fun();
        System.out.println(x);
        int x=0;
        System.out.println(x);
    }
    static void Fun() {
        x=20;
    }
}
