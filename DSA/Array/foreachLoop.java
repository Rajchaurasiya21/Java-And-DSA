public class foreachLoop {
    static void main() {
        System.out.println("ForEach Loop");
        int arr[] = {1, 0, 2, 0, 2, 9};
        for (int i=0;i<arr.length;i+=2) {
            int temp=arr[i];
            arr[i]=arr[i-1];
            arr[i-1]=temp;
            System.out.println(arr[i]);

            }
        }

    }