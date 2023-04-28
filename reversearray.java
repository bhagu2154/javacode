package Array;
////this is not correct way to reverse the array
public class reversearray {
    public static void main(String[] args) {
        int [] array={1,2,3,4,5,6,7,8,9,0};
        for( int index=array.length-1;index>=0;index--){
            System.out.println(array[index]);
        }
    }
}
