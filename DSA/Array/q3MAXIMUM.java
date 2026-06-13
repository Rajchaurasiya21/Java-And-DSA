public class q3MAXIMUM {
    static void main() {
        System.out.println("Find Maximum");
        int [] arr= {1,2,9,4,5};
        int max= Integer.MIN_VALUE; // for MIN Change min to MAX
        for(int i=0;i<arr.length;i++){
            if (arr[i]>max) // < for MIN
                max=arr[i];

        }
        System.out.println(max);
    }
}
