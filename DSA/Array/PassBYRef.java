
public class PassBYRef {
    static void main() {
        System.out.println("Array Pass By Ref");
        int arr[] = {1, 5, 9, 8};
        System.out.println(arr[2]);
        hii(arr);
        System.out.println(arr[2]);
    }

    static void hii(int [] y) {
        y[2]=2;

    }
}
