import java.util.Scanner;

public class sumofdigit {
    public static void main(String[] args) {
        {
            Scanner Scanner = new Scanner(System.in);
            System.out.println("enter  any digit number ");
            int num= Scanner.nextInt();
            int sum=0;
            while(num>0)
            {
              int ld= num % 10;
                sum= sum + ld;
                num= num / 10;
                System.out.println("sum of digit ="+sum);
            }
        }
    }
}
