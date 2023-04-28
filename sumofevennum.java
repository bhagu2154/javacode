import java.util.Scanner;

public class sumofevennum {
    public static void main(String[] args) {
        int sum=0;
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        for ( int i=1;i<=n;i++)
            if(i%2==0)
            {
                sum=sum+i;
                System.out.println("sum of all even  numbers is="+sum);
        }
    }}

