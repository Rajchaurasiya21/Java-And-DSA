public class reverseArray {
    static void main() {
        System.out.println("Reverse Array");
        int arr[] = {1, 9, 8, 5, 4, 7, 6};
        int n=arr.length;
        int i=2;
        int j=n-2  ;
        while(i<j) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
          for(int ele :arr)
            System.out.print(ele+" ");
        }
    }
