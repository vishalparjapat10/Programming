package Strings;
import java.util.*;
public class PrintSubStrings {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		for(int i = 0;i < str.length();i++) {
			int k = i+1;
			while(k < str.length()+1) {
				System.out.println(str.substring(i,k));
				k++;
			}
		}
    }
}
