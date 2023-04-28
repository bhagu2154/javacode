import java.io.File;
import java.util.Scanner;

public class csv {
    public static void main(String[] args) {
        Scanner sc = new Scanner("C:\\csvf");
        sc.useDelimiter(",");
        while (sc.hasNext()) ;
        {
            System.out.println(sc.next());
        }
        sc.close();
    }
}