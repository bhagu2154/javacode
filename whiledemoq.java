import java.util.Scanner;

public class whiledemoq {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=0;
        int sum=0;
        char wantToContinue='q';
        int counter=0;
        while(wantToContinue!='q')
            System.out.println("enter the number");
        number= scanner.nextInt();
        counter++;
        sum=sum+number;
        System.out.println("sum is="+sum);
        System.out.println("avg is="+sum/counter);
        System.out.println("do you want to stop then enter q");
    }
}
