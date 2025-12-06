import java.util.Set;
import java.util.HashSet;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// Se usa HashSet porque no permite elementos repetidos
        // y valida rápidamente si un nombre ya existe.
        Set<String> nombres = new HashSet<>();

        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Juan"); // duplicado, no se guarda

        System.out.println("Lista de participantes:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}