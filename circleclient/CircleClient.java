
package circleclient;


public class CircleClient {

    public static void main(String[] args) {
       
       Circle c1 = new Circle();
       Circle c2 = new Circle(4, new int[]{4,5});
       Circle c3 = new Circle(-2, 5, 3);
       System.out.println(c1.toString());
       System.out.println(c2.toString());
       System.out.println(c3.toString());
       
       // c2.setRadius(0.5);
       // System.out.println(c2.toString());
       
       System.out.println(c2.area());
       System.out.println(c2.circumference());
    }
    
}
