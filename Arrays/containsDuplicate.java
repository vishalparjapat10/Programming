import java.util.*;
public class containsDuplicate {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        for(int i = 0;i < a.length;i++){
            a[i] = scn.nextInt();
        }
        print(a);
        boolean ans = find(a);
        System.out.println(ans);
    }

    private static boolean find(int nums[]){

        // Time complexity: O(N^2), memory: O(1)
        // for(int i = 0; i < nums.length; i++) {
        //     for(int j = i + 1; j < nums.length; j++) {
        //         if(nums[i] == nums[j]) {
        //             return true;
        //         }
        //     }
        // }
        // return false;

        // OR

        //Time complexity: O(N lg N), memory: O(1) - not counting the memory used by sort
        Arrays.sort(nums);
        for(int ind = 1; ind < nums.length; ind++) {
            if(nums[ind] == nums[ind - 1]) {
                return true;
            }
        }
        return false;
    }

    private static void print(int a[]){
        for(int i = 0;i < a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
