
package quadraticdriver;

import java.awt.geom.Point2D;


public class Quadratic {
    private Fraction a, b, c;
    public static final Fraction ZERO = new Fraction(0,1); 
    public static final Fraction ONE = new Fraction(1,1);
    public static final Fraction NEG_ONE = new Fraction(-1,1);
    public Quadratic(){
        this(ZERO,ZERO,ZERO);
    }

    public Quadratic(Fraction a){
        this(a, ZERO , ZERO);
    }

    public Quadratic(Fraction a, Fraction b){
        this(a,b,ZERO);
    }
    
    public Quadratic(Fraction a, Fraction b, Fraction c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Fraction getA() {
        return a;
    }
    
    public Fraction getB(){
        return b;
    }
    public Fraction getC(){
        return c;
    }
    
    public void setA(Fraction f){
        
    }
    
    public void setB(Fraction f){
        
    }
    
    public void setC(Fraction f){
        
    }
    
    public double[] solve(){
        double[] solution = new double[numOfRealRoots()];
        int roots = numOfRealRoots();
        if(roots == 1)
            solution[0] = NEG_ONE.multiply(b).divide(a).toDouble()/2;
        else if(roots == 2){
            solution[0] = (NEG_ONE.multiply(b).toDouble() + Math.sqrt(discriminant()))/2/a.toDouble();
            solution[1] = (NEG_ONE.multiply(b).toDouble() - Math.sqrt(discriminant()))/2/a.toDouble();
                    }
        return solution;
    }
    
    public double discriminant(){
        return b.multiply(b).subtract(a.multiply(c).multiply(new Fraction(4))).toDouble();
    }
    
    public int numOfRealRoots(){
        if(discriminant() > 0)
            return 2;
        else if(discriminant() == 0)
            return 1;
        else
            return 0;
    }
    
    public int numOfImagRoots(){
        return(discriminant() < 0)? 2:0;
    }
    
    public Quadratic add(Quadratic q){
        return new Quadratic(a.add(q.a), b.add(q.b), c.add(q.c));
    }
    
    public Quadratic subtract(Quadratic q){
        return new Quadratic(a.subtract(q.a), b.subtract(q.b), c.subtract(q.c));
    }
    
    public boolean opensUp(){
        return a.toDouble() > 0;
    }
    
    public Point2D.Double locateVertex(){
        double x = b.divide(a).toDouble()/(-2);
        return new Point2D.Double(x, eval(b.divide(a).divide(new Fraction(-2))).toDouble());
    }

    public Fraction eval(Fraction f){
        return a.multiply(f).multiply(f).add(b.multiply(f)).add(c);
    }
    
    public Fraction slope(Fraction f){
            return new Fraction(2).multiply(a).multiply(f).add(b);
            // OR: derivative().eval(f)
    }
    
    public Quadratic derivative(){
       return new Quadratic(ZERO, a.multiply(new Fraction(2)), b); 
    }

    @Override 
    public String toString(){
        StringBuilder expr = new StringBuilder();
        if(a.equals(ZERO) && b.equals(ZERO) && c.equals(ZERO))
            expr.append(0);
        if(!a.equals(ZERO)){
            if(a.equals(ONE))
                expr.append("x^2");
            else if(a.equals(NEG_ONE))
                expr.append("-x^2");
            else
                expr.append(a).append("x^2");
        }
            // Deal with the linear coefficient
            if(!b.equals(ZERO)){
                if(!a.equals(ZERO) && b.getNumerator() > 0)
                    expr.append("+");
                if(b.equals(ONE))
                   expr.append("x");
                else if(b.equals(NEG_ONE))
                    expr.append("-x");
                else
                    expr.append(b).append("x");
            }
        // Deal with the constant
        if((!a.equals(ZERO) || !b.equals(ZERO)) && !c.equals(ZERO))
            expr.append("+");
        
        if(!c.equals(ZERO))
            expr.append(c);
        return expr.toString();
        }
        
    

    @Override 
    public boolean equals(Object o){
        return a.equals(((Quadratic)o).a) &&b.equals(((Quadratic)o).b)&&
                c.equals(((Quadratic)o).c);
    }

}
