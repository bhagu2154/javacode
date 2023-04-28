package classandobject;

public class Distance {
    float add(float distance1,float distance2){
        return distance1+distance2;
    }

    public static void main(String[] args) {
        Distance distance=new Distance();
        System.out.println(distance.add( 5,6));
    }
}
