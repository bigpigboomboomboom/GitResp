package zhu.input_output;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author zhu @create 2021-04-14 8:40
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] nums = new int[a];
        for(int i = 0; i < a ; i++){
            nums[i] = in.nextInt();
        }
        in.close();
        int len = nums.length;

        for(int length = len ; length > 0 ; length--){
            for (int i = 0 ;i < len - length + 1 ; i ++ ){
                int min = nums[i] ;
                for (int j = i ; j < length+i ; j ++){
                    if (min > nums[j]){
                        min = nums[j];
                    }
                }
                if (min >= length){
                    System.out.println(length);
                    return ;
                }
            }
        }



    }

}
