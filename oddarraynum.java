package Array;

public class oddarraynum {
    public static void main(String[] args) {
        int []array={1,2,3,4,5,6,7,8,9,35,37};
        for ( int index=0;index< array.length;index++)
            if(array[index]%2==1)
        System.out.println(array[index]);
    }
}
