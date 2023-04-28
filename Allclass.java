package classandobject;

public class Allclass {
    int a = 100;//instance var

    void m1() {
        System.out.println("instance method");
    }

    static int b = 12;//static var

    static  void m2(){
        System.out.println("static method");
    }
    {
        System.out.println("instance block");
    }
    {
        System.out.println("static block");
    }

    public static void main(String[] args) {
        int c=200;
        Allclass allclass = new Allclass();
        //accessing varible
        System.out.println("instance var = " + allclass.a);
        System.out.println("static var = " + Allclass.b);
        System.out.println("local var="+c);
        //accessing method
        allclass.m1();
        allclass.m2();

    }
}