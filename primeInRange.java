public class primeInRange {
    public static void main(String[] args) {

        for (int n = 1; n <= 100; n++)
            if (isprime( n))
            {
            System.out.println( n);
        }}
        private static boolean isprime ( int num){
            boolean isprime = true;
            for (int i = 2; i <=num/ 2; i++){
                if(num%i==0)
                isprime = false;
            break;
        }

    return isprime;
            }}