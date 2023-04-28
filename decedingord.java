package Array;

import java.lang.reflect.Array;

public class decedingord {
    public static void main(String[] args) {

        int[] array = {1, 2, 5, 3, 4, 8, 6, 9};
        int temp;
        for (int i=0;i< array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if (array[i]<array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
            System.out.print(array[i]+" ");
        }
    }
}