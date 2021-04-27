package zhu.input_output;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author zhu @create 2021-04-14 8:22
 */
public class input {
        //输入数组
        public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);
           // while (reader.hasNext()) {
                int m = reader.nextInt();
                int[] numbers = new int[m];
                for (int index = 0; index < m; index++) {
                    numbers[index] = reader.nextInt();
                }
                System.out.println(numbers[0]+numbers[1]);
                System.out.println(Arrays.toString(numbers));

          //  }
            reader.close();

           System.out.println("*****");

            //输入一个矩阵
//            Scanner reader = new Scanner(System.in);
//            int m = reader.nextInt();
//            int n = reader.nextInt() ;
//            int [][] array = new int[m][n] ;
//            for (int i=0 ; i<m ; i++)
//                for(int j=0 ;j<n ;j++)
//                {
//                    array[i][j]=reader.nextInt();
//                }
//            reader.close() ;


        }
}




    /**
     *
     * @ClassName: Class_5
     * @Description: 输入一个单词字符串
     * @author Smallji
     * @date 2018年4月4日 上午10:09:24
     *
     */
//    public class Class_5 {
//        public static void main(String[] args) {
//            Scanner in = new Scanner(System.in);
//            String c = in.next() ;
//            System.out.println(c);
//            in.close();
//        }
//
//    }

/**
 *
 * @ClassName: Class_5
 * @Description: 输入一个单词字符串
 * @author Smallji
 * @date 2018年4月4日 上午10:09:24
 *
 */
 class Class_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String c = in.next() ;
        System.out.println(c);
        in.close();
    }

}
