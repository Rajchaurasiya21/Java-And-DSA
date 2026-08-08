public class onetoN {
    static void main() {
        print(1, 5);
    }
    static void print(int x,int n) {
        if (x > n) return; // <------- BASE CASE.
        System.out.println(x); // <------- WORK.
        print(x + 1, n); // <--------- CALL
    }
}

