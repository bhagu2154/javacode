public class Triangle {
    int side1 = 2;
    int side2 = 3;
    int side3 = 5;

    int area() {
        return (side1 * side2) / 2;
    }


        int perimeter(){
         return side1 + side2 + side3;
    }

    public static void main(String[] args) {
        Triangle tringle1=new Triangle();
        tringle1.side1=3;
        tringle1.side2=4;
        tringle1.side3=5;
        System.out.println("area of tringle is"+tringle1.area());
        System.out.println("area of tringle is"+tringle1.perimeter());


    }
}