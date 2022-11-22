
package fractiondriver;


public class Fraction {
    private int numerator;
    private int denominator;
    
    // Three constructors
    // There will be no return types so no static
    public Fraction(){// Default (no-arg) constructor
        numerator = 0;
        denominator = 1;
    
    }

    public Fraction(int num){
        numerator = num;
        denominator = 1;
    }
                                     // Notice for documentation it is throws and not throw
    public Fraction(int num, int den) throws IllegalArgumentException{
        if(den == 0)
            throw new IllegalArgumentException("Cannot divide by 0");
        numerator = num;
        denominator = (numerator != 0) ? den : 1;
        simplify();
    }

    // Accessors (getters)
    public int getNumerator(){
        return numerator;
    }

    public int getDenominator(){
        return denominator;
    }

    // Mutators (setters)
    public void setNumerator(int num){
        numerator = num;
    }

    public void setDenominator(int den) throws IllegalArgumentException {
        if(den == 0)
            throw new IllegalArgumentException("Cannot divide by 0");
        denominator = den;
    }

    public Fraction add(Fraction f){
        return new Fraction(numerator*f.denominator + f.numerator*denominator, 
            denominator * f.denominator);
    }

    public Fraction subtract(Fraction f){
        return new Fraction(numerator*f.denominator - f.numerator*denominator, 
            denominator * f.denominator);
    }

    public Fraction multiply(Fraction f){
        return new Fraction(numerator*f.numerator, denominator*f.denominator);
    }

    public Fraction divide(Fraction f){
        // This is a point to itself
        return this.multiply(f.reciprocal());
    }

    public Fraction reciprocal(){
        if(numerator == 0)
            throw new NumberFormatException("Reciprocal is undefined");
        return new Fraction(denominator, numerator);
    }

    public double toDouble(){
        return (double)numerator/denominator;
    }

    private void simplify() {
       if(denominator < 0) {
           numerator *= -1;
           denominator *= -1;
       }
       
       int gcf = Math.abs(numerator) < Math.abs(denominator)? 
                            Math.abs(numerator) : Math.abs(denominator);
       while(gcf > 1 && (numerator%gcf != 0 || denominator%gcf != 0))
           gcf--;
       
       if(gcf > 1) {
           numerator /= gcf;
           denominator /= gcf;
       }
           
    }
    
    @Override
    public String toString(){
        if(denominator > 1)
            return numerator + "/" + denominator;
        else
            return "" + numerator;
    }
    
    @Override 
    public boolean equals(Object o){
        return numerator == ((Fraction)o).numerator && denominator == ((Fraction)o).denominator;
    }
}
