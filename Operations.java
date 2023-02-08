
package calculadora.jdj;


public class Operations {
    
    
    public float sum (float a, float b){
        return a+b; 
    }
    public float rest (float a, float b){
        return a-b; 
    }
    public float product (float a, float b){
        return a*b; 
    }
    public float divided (float a, float b){
        return a/b; 
    }
    public double sin (double a){
        double b = Math.toRadians(a);
        return Math.sin(b);
    }
    public double cos (double a){
        double b = Math.toRadians(a);
        return Math.cos(b);
    }
    public double tan (double a){
        double b = Math.toRadians(a);
        return Math.tan(b);
    }
    public double root (int a, int b){
        return Math.pow(a, 1.0/b);
    }
    public double power (int a, int b){
        return Math.pow(a, b);
    }
    public float iva (float a, float b){
        return (a*b)/100;
    }
    
}
