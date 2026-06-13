public class twoSum {
    static void main() {
        int nums[] = {1, 2, 6, 4, 8, 9};
        int target = 11;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {

                    System.out.println(i + " " + j);
                    System.out.println("Adding elements " + nums[i] + " " + nums[j]);

                }
            }
        }
    }
}