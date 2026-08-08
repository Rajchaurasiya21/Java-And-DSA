class increasingAndDecreasing{
    static void main() {
        print(5);

    }

    static void print(int n) {
        if(n==0) return;
        print(n-1);
        System.out.println(n);
    }
}