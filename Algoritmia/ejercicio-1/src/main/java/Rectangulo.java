public class Rectangulo {

    private int ancho;
    private int largo;

    public Rectangulo(int ancho, int largo) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAncho() {
        return ancho;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getLargo() {
        return largo;
    }

    public static int area(int ancho, int largo) {
        return ancho * largo;
    }
}
