package Array;

public class multidia {
    public static void main(String[] args) {
        int[][]array={
                {10,20,30},
                {40,50,60},
                {70,80,90}
        };
        System.out.println(array);
        System.out.println("multidia array length is ="+array.length);
        System.out.print(array[0][0]+" ");//10
        System.out.print(array[0][1]+" ");//20
        System.out.println(array[0][2]);//30
        System.out.print(array[1][0]+" ");//40
        System.out.print(array[1][1]+" ");//50
        System.out.println(array[1][2]);//60
        System.out.print(array[2][0]+" ");//70
        System.out.print(array[2][1]+" ");//80
        System.out.println(array[2][2]+"");//90
        System.out.println(array[0]);//r1 hashcode
        System.out.println(array[1]);//r2 hashcode
        System.out.println(array[2]);//r3 hashcode

    }
}
