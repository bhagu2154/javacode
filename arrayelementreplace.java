package Array;

public class arrayelementreplace {
    public static void main(String[] args) {
         int [] array={1,2,4,5,7,3,8,4555};
         array[5]=90;
         //array[8]=28;//we get the exception which is ArrayIndexBoundException
       // array[-1]=23;//we get the exception which is ArrayIndexBoundException
        for (int index=0;index< array.length;index++){
             System.out.println(array[index]);
         }
    }
}
