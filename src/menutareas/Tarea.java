package menutareas;

/**
 * Representa una tarea con descripción y estado de completado.
 * @author Raul
 */
public class Tarea {

    private String descripcion;
    private boolean completada;

    /**
     * Crea una tarea con la descripción indicada.
     * @param descripcion descripción de la tarea
     */
    public Tarea(String descripcion) {
        this.descripcion = descripcion;
        this.completada = false;
    }

    /**
     * Obtiene la descripción.
     * @return descripción de la tarea
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Modifica la descripción.
     * @param descripcion nueva descripción
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Indica si está completada.
     * @return true si está completada; false si no
     */
    public boolean isCompletada() {
        return completada;
    }

    /**
     * Cambia el estado de completado.
     * @param completada nuevo estado
     */
    public void setCompletada(boolean completada) {
        this.completada = completada;
    }
}
