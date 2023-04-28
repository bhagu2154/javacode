package Array;

public class Linearsearchtree {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int equ = 1;
        boolean ispresent = false;
        int index;
        for (index = 0; index < array.length; index++)
            if (equ == array[index]) {
                ispresent = true;
                break;
            }
        System.out.println(ispresent ? "present" : "not present");

        //System.out.println("is present  " + index);
    }
}