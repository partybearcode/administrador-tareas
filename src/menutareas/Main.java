package menutareas;

import java.util.Scanner;

/**
 * Clase principal de la aplicación de consola.
 * <p>
 * Muestra un menú interactivo para gestionar una lista de tareas, permitiendo:
 * </p>
 * <ul>
 *   <li>Añadir una tarea (opción 1).</li>
 *   <li>Listar las tareas existentes (opción 2).</li>
 *   <li>Marcar una tarea como completada (opción 3).</li>
 *   <li>Salir del programa (opción 0).</li>
 * </ul>
 *
 * @author Raúl
 * @author Erik
 */
public class Main {

    /**
     * Punto de entrada de la aplicación.
     * <p>
     * Crea un {@link GestorTareas} y gestiona la interacción con el usuario
     * mediante un menú repetitivo que solicita una opción por teclado. El bucle
     * se repite hasta que el usuario selecciona la opción 0 (salir).
     * </p>
     * <p>
     * La entrada de la opción se valida para asegurar que sea un número entero.
     * </p>
     *
     * @param args argumentos de línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        GestorTareas gestor = new GestorTareas();
        Scanner sc = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("=== GESTOR DE TAREAS ===");
            System.out.println("1. Añadir tarea");
            System.out.println("2. Listar tareas");
            System.out.println("3. Marcar tarea como completada");
            System.out.println("0. Salir");
            System.out.print("Opción: ");

            while (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.print("Entrada inválida. Opción: ");
            }
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Introduce la descripción: ");
                    String descripcion = sc.nextLine();
                    gestor.añadirTarea(descripcion);
                    break;

                case 2:
                    gestor.mostrarTareas();
                    break;

                case 3:
                    // Mostrar tareas para que el usuario vea los números
                    gestor.mostrarTareas();

                    System.out.print("Número de tarea a marcar como completada: ");
                    while (!sc.hasNextInt()) {
                        sc.nextLine();
                        System.out.print("Entrada inválida. Número de tarea: ");
                    }
                    int numeroTarea = sc.nextInt();
                    sc.nextLine(); // limpiar salto de línea

                    gestor.marcarCompletada(numeroTarea);
                    break;

                case 0:
                    System.out.println("Hasta luego.");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

            System.out.println();
        } while (opcion != 0);

        sc.close();
    }
}