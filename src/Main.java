import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Persona> listaEstudiantes;
        listaEstudiantes = new ArrayList<>();
        Persona p = new Persona("Pedro", "M", 20, "0962820517","Software", 9.50);
        listaEstudiantes.add(p);
        Estudiante est = new Estudiante();
        est.menu(listaEstudiantes);
    }
}