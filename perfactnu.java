import java.util.Scanner;

public class perfactnu {
    public static void main(String[] args) {
        int sum=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter any number");
        int num= scanner.nextInt();
     for(int i=1;i<num;i++) {
         if (num % i == 0)
         {
             sum = sum + i;
         }
     }
             System.out.println(sum==num? "number is perfect":"number is not perfect");

     }}

//6....n/6 1 2 3 =6.....>perfect
//13... 1,13.....> not perfect
