public class leapYear {
    public static void main(String[] args) {
        int year = 2028;
        System.out.println(year%400==0||(year!=100) &&(year%4==0));
    }
}