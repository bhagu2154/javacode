package Array;

public class ascendingorder {
    public static void main(String[] args) {
        int [] array={20,10,40,30,50};
        int temp;
        for (int index=0;index<array.length;index++){
            {
                for (int j=index+1;j< array.length;j++)
                {
                    if (array[index]>array[j]){
                        temp=array[index];
                        array[index]=array[j];
                        array[j]=temp;
                    }
                }
                System.out.print( array[index]+" ");
            }
        }
    }

}
