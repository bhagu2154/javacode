package Array;

import java.lang.reflect.Array;

public class sumarray {
    public static void main(String[] args) {
        int[] array = {1, 3, 2, 5, 6, 7, 8};
        int sum = 0;
        System.out.println("sum of array elements");
        int i;
       // int avg = 0;
        for (i = 0; i < array.length; i++) {
            sum = sum + array[i];
            //{
               // avg = sum / 2;
           // }
        }
        System.out.println(sum);
       // System.out.println(avg);
    }
}