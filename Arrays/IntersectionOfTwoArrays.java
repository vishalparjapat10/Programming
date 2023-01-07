import java.util.*;
public class IntersectionOfTwoArrays {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        for(int i = 0;i < a.length;i++){
            a[i] = scn.nextInt();
        }
        int m = scn.nextInt();
        int b[] = new int[m];
        for(int i = 0;i < b.length;i++){
            b[i] = scn.nextInt();
        }
        int ans[] = find(a,b);
        print(ans);
    }

    private static int[] find(int[] nums1,int[] nums2){
        int n = nums1.length;
        int m = nums2.length;
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        while(i < n && j < m){
            if(nums1[i] == nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] < nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }

        int ans[] = new int[list.size()];
        for(int k = 0;k < list.size();k++){
            ans[k] = list.get(k);
        }
        return ans;

    }
    private static void print(int a[]){
        for(int i = 0;i < a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
