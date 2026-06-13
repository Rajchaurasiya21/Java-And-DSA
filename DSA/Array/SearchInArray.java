public class SearchInArray {
    public static void main(String[] args) {
        System.out.println("Search in array");
        int[] arr={4,5,6,9,7,1,2,3};
        int target=9;
        boolean flag= true;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                flag=true;
                break;
            }
        }
        if (flag==true)
            System.out.println("Target founded");
            else
                System.out.println("Target is missing");
            }
        }


