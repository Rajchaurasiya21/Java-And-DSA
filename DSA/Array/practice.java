class practice{
    static void main() {
        int[] arr={0,1,0,0,1,0,1,0,1};
        int Zeroes=0;
        for(int ele: arr){
            if(ele==1){
            Zeroes++;
                System.out.println(Zeroes);

            }
        }
        for(int i=0;i<Zeroes;i++) {
            arr[i] = 0;

        }
           for(int i=Zeroes;i<arr.length;i++ ){
               arr[i]=1;

           }
           for(int ele: arr){
        System.out.print(ele+" ");
           }
    }
}