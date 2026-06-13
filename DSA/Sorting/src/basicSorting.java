public class basicSorting {

        public static void print(int[] arr) {
            for(int ele: arr){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
        static void main() {
        int arr[] = {4, 5, 7, 6, 2, 1, 3};
        int n=arr.length-1;
        print(arr);

        for (int i = 0; i < n; i++) {
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }

        }
            print(arr);
        for(int j=1;j<=n;j++){
            for (int i = 0; i < n; i++) {
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }

            }
        }
            print(arr);
    }
}