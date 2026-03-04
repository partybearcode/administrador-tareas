package menutareas;

import java.util.ArrayList;

/**
 * Clase que gestiona una lista de tareas.
 *
 * @author Raul & Erik
 */
public class GestorTareas {

    private final ArrayList<Tarea> tareas;

    /**
     * Crea un gestor vacío.
     */
    public GestorTareas() {
        tareas = new ArrayList<>();
    }

    /**
     * Muestra por consola el listado de tareas. Si no hay tareas, informa al
     * usuario.
     */
    public void mostrarTareas() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas registradas.");
            return;
        }

        for (int i = 0; i < tareas.size(); i++) {
            Tarea t = tareas.get(i);
            String estado = t.isCompletada() ? "[X]" : "[ ]";
            System.out.println((i + 1) + ". " + estado + " " + t.getDescripcion());
        }
    }

}
