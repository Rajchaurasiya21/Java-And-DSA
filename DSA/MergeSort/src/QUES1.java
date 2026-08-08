public class QUES1 {
   public  static void main(String[] args) {
       int [] arr={5,9,4,1,6,3,2,7};
       mergeSort(arr);
       for(int ele: arr) System.out.print(ele+" ");
    }
    private static void mergeSort(int [] arr) {
       int n=arr.length;
       if (n ==1) return;
       int[] x=new int[n/2];
        int[] y=new int[n-n/2];
        int idx=0;
        for(int i=0;i<x.length;i++)  x[i]=arr[idx++];
        for(int i=0;i<y.length;i++)  y[i]=arr[idx++];
        mergeSort(x);
        mergeSort(y);
        merge(x,y,arr);

    }
    private static void merge(int[] x,int[]y,int[]z) {
       int i=0,j=0,k=0;
       while(i<x.length && j<y.length){
           if(x[i]<=y[j]) z[k++]=x[i++];
           else z[k++]=y[j++];
       }
        while(i<x.length) z[k++]=x[i++];
        while(i<y.length) z[k++]=y[j++];
    }
}
