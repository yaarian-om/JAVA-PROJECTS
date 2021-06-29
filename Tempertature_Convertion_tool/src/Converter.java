
public class Converter implements I_Methods{
    /*
       Encapsulation
       Abstraction
       Polymorphism
       Interface
    */
    private double c,f,k;
    
    // Constructor Overloading
    public Converter(){/*System.out.println("Empty Constructor");*/}
    public Converter(double c,double f,double k){
        this.c = c;
        this.f = f;
        this.k = k;
    }
    // Setter Getter Methods
    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getF() {
        return f;
    }

    public void setF(double f) {
        this.f = f;
    }

    public double getK() {
        return k;
    }

    public void setK(double k) {
        this.k = k;
    }
    
    // Methods Overriding
    public double celciusToFarenheit(double c){
        double f = (c*(9.0/5))+32;
        return f;
    }
    public double celciusToKelvin(double c){
        double k = c+273;
        return k;
    }
    public double farenheitToCelcius(double f){
        double c = (f-32)*(5.0/9);
        return c;
    }
    public double kelvinToCelcius(double k){
        double c = k-273;
        return c;
    }
    public double farenheitToKelvin(double f){
        double k = (f-32)*(5.0/9)+273.15;
        return k;
    }
    public double kelvinToFarenheit(double k){
        double f = (k-273.15)*(9.0/5)+32;
        return f;
    }
}
