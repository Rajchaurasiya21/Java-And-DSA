public class SecondLargest {
    static void main() {
        System.out.println("Second Largest");
        int arr[]={1,2,3,9,10,15};
        int max=Integer.MIN_VALUE;
        int Smax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
            for(int i=0;i<arr.length;i++){
                if(arr[i]>Smax && arr[i]!=max)
                    Smax=arr[i];
            }
        System.out.println("Largest:"+max);
        System.out.println("Second Largest:"+Smax);
    }
}
