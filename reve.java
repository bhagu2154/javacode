package Array;

public class reve {
    public static void main(String[] args) {
         int [] array={1,3,24,5,6,67,8,9,54};
         int left;
         int right;
         for (left=0,right=array.length-1;left<right;left++,right--){
           int  temp= array[left];
           array[left]=array[right];
           array[right]=temp;}
             System.out.println("printing array in reverse order");
             for (int index=0;index< array.length;index++){
                 System.out.println(array[index]);
             }
         }
}
