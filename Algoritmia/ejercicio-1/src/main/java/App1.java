public class App1 {
    public static void main(String[] args) {

        Rectangulo rect1 = new Rectangulo(5, 20);

        System.out.println(Rectangulo.area(rect1.getLargo(), rect1.getAncho()));

        Rectangulo rect2 = new Rectangulo(10, 50);

        System.out.println(Rectangulo.area(rect2.getAncho(), rect2.getLargo()));

        Triangulo tri1 = new Triangulo(10, 20);

        System.out.println(Triangulo.area(tri1.getBase(), tri1.getAltura()));
    }
}
