public class productOfArray {
    static void main() {
        System.out.println("Product of array");
        int arr[]={1,2,5,6,7,8,-2,5};
        int product=1;
        for(int i=0;i<arr.length;i++){
            product *=arr[i];

        }
        System.out.println(product);
    }
}
