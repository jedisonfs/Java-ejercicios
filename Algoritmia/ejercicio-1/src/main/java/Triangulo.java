public class Triangulo {

    private double base;
    private double altura;

    public Triangulo (double base,double altura){
        this.altura = altura;
        this.base = base;
    }

    public void setBase(double base){
        this.base = base;
    }

    public double getBase(){
        return base;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getAltura(){
        return altura;
    }

    public static double area(double base,double altura){
        return base*altura/2;
    }
}
