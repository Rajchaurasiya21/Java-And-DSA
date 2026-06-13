public class aa {
    public static void print(int[] arr) {
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();


    }
    static void main() {
        int [] arr={5,2,3,6,4,8,1,3,9};
        int n=arr.length-1;
        for(int j=0;j<n;j++){
            if(arr[j]>arr[j+1]){
                int  temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;

            }
        }
        print(arr);
        for(int i=0;i<=n;i++){
            for(int j=0;j<n;j++){
                if(arr[j]>arr[j+1]){
                    int  temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;


                }
            }
        }
        print(arr);
    }
}
