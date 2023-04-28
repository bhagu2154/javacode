import java.util.Scanner;

public class sumoffdigit {
    public static void main(String[] args) {
       int sum=0; int lastdigit;
       Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
       int num= sc.nextInt();
       while(num>0)
       {
           lastdigit=num%10;
       sum=sum+lastdigit;
       num=num/10;

        System.out.println("sum of digit"+sum);


    }
}}
