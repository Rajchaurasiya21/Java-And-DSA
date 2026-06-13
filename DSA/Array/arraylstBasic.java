import java.util.*;
public class arraylstBasic {
    static void main() {


        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(21);
        arr.add(23);
        arr.add(12);
        arr.add(25);

        System.out.println(arr.get(3));
        arr.set(3,50);
        System.out.println(arr.get(3));
        int n=arr.size();
        for(int ele: arr){
            System.out.println(arr);
        }
    }
}
