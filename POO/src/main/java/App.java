import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Fabian","25",Sexo.MASCULINO);

        cliente.setSexo(Sexo.FEMENINO);

        System.out.println(cliente.getEdad());
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getSexo().ordinal());


        List<Integer> arreglito = new ArrayList<Integer>();

        arreglito.add(1);
        arreglito.add(2);
        arreglito.add(3);
        arreglito.add(4);
        arreglito.add(5);

        arreglito.stream().map(x -> x*5)
                .forEach(y -> System.out.println(y));

    }
}
