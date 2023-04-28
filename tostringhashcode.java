public class tostringhashcode {
    public static void main(String[] args) {
        int number = 10;//decimal number system
        System.out.println("Binary " + Integer.toBinaryString(number));
        System.out.println("octal " + Integer.toOctalString(number));
        System.out.println("hexadeci " + Integer.toHexString(number));

        tostringhashcode course = new tostringhashcode();
        System.out.println(course);

    }
}