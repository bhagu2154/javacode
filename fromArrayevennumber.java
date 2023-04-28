package Array;

public class fromArrayevennumber {
    public static void main(String[] args) {
        int []array={1,2,22,34,3,4,55,66,75,78,8,9};
        for (int index=0;index< array.length;index++){
            if (array[index]%2==0)
            System.out.println(array[index]);
        }
    }
}
