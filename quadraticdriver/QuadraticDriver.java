
package quadraticdriver;

import java.util.Arrays;


public class QuadraticDriver {

   private static final int SIZE= 8;
    public static void main(String[] args) {
        Quadratic[] quad = new Quadratic[SIZE];    
        quad[0] = new Quadratic();
        quad[1] = new Quadratic(new Fraction(2,3), new Fraction(6), new Fraction(9));
        quad[2] = new Quadratic(new Fraction(-1), new Fraction(5,-4));
        quad[3] = new Quadratic(new Fraction(-7,-3));
        quad[4] = new Quadratic(new Fraction(), new Fraction(), new Fraction());
        quad[5] = new Quadratic(new Fraction(), new Fraction(), Quadratic.ONE);
        quad[6] = new Quadratic(new Fraction(), new Fraction(), new Fraction(-7,4));
        quad[7] = new Quadratic(new Fraction(3), Quadratic.ONE, Quadratic.ONE);
        for(Quadratic q: quad)
            System.out.println(q);
        
        System.out.println("Q3? " + quad[3].equals(new Quadratic(new Fraction(14,6))));
        System.out.println("Discriminate of Q1? " + quad[1].discriminant());
        System.out.println("Discriminate of Q1? " + quad[2].discriminant());
        System.out.println("Imaginary roots of Q7? " + quad[7].numOfImagRoots());   
        System.out.println("Real roots of Q1? " + quad[1].numOfRealRoots());
        System.out.println("Solutions of Q1" + Arrays.toString(quad[1].solve()));
        System.out.println("Solutions of Q7" + Arrays.toString(quad[7].solve()));
        System.out.println("Solutions of Q2" + Arrays.toString(quad[2].solve()));
        System.out.println("Derivate of Q1? " + quad[1].derivative());
        System.out.println("Evaluate Q1?" + quad[2].eval(new Fraction(4)));
        System.out.println("Opens up? " + quad[2].opensUp());
    }
    
}
