import java.util.Scanner;

public class sumfactors {
    public static void main(String[] args) {
        int sum=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter any number");
        int num= scanner.nextInt();
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                sum=sum+i;
                System.out.println(i + " is a factor of "+num);
                {
                    System.out.println("sum of operator.factors="+sum);
            }
        }
    }
}}
