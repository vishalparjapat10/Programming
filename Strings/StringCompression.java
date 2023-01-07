package Strings;
import java.util.*;
public class StringCompression {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        String ans = StringCompression(str);
        System.out.println(ans);
    }

    private static String StringCompression(String str) {
        int i = 0;
        String ans = "";
        while(i < str.length())
        {
            int k = i + 1;
            int count = 1;
            char curr = str.charAt(i);
            while(k < str.length() && curr == str.charAt(k)){
                count++;
                i++;
                k++;
            }
            if(count > 1){
                ans = ans + curr + count;
                i++;
            }
            else{
                ans = ans + curr;
                i++;
            }
        }

        return ans;
    }
}
