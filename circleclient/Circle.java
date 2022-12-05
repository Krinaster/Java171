package circleclient;

import static java.lang.Math.PI;

public class Circle {

    private double radius;
    private int[] center = new int[2];
    
    public Circle(){ // Default no-arg Circle Constructor
        this(1, new int[]{0,0});
    }
    

    public Circle(double rad, int[] cen){
        radius = (rad > 0)? rad: 1;
        center[0] = cen[0];
        center[1] = cen[1];
    }
    
    public Circle(double rad, int x, int y) { 
        radius = (rad > 0)? rad: 1;
        center[0] = x;
        center[1] = y;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public int[] getCenter(){
        return center;
    }
    
    public int getCenterX(){
        return center[0];
    }
    
    public int getCenterY(){
        return center[1];
    }
    
    public void setRadius(double rad){
        if(rad > 0)
            radius = rad;
        else
            System.out.println("0 or negative radius is invalid");
    }
    
    public void setCenter(int x, int y){
        center[0] = x;
        center[1] = y;
    }
    
    
    public void setCenter(int[] cen){
        center[0] = cen[0];
        center[1] = cen[1];
    }
    
    public void setCenterX(int x){
        center[0] = x;
    }
    
    public void setCenterY(int y){
        center[1] = y;
    }
    
    @Override
    public String toString(){
        return "r = " +radius + " " +  "(" +center[0] + "," + center[1] + ")";
    }
    
    @Override
    public boolean equals(Object o){
        return radius==(((Circle)o).radius) && center[0]==(((Circle)o).center[0]) &&
                center[1]==(((Circle)o).center[1]);
    }
    
    public boolean areCongruent(Circle c){
        return this.radius == c.radius;
    }
    
    public double area(){
        return Math.pow(radius,2) * PI;
    }
    
    public double circumference(){
        return 2*PI*radius;
    }
    
    public void shift(int x, int y){
        center[0] += x;
        center[1] += y;
    }
    
    public void shift(int x){
        center[0] += x;
    }

} // End of class
