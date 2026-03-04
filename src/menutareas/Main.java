package menutareas;

import java.util.Scanner;

/**
 * Menú principal de la aplicación.
 *
 * @author Raúl & Erik
 */
public class Main {

    public static void main(String[] args) {
        GestorTareas gestor = new GestorTareas();
        Scanner sc = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("=== GESTOR DE TAREAS ===");
            System.out.println("1. Añadir tarea");
            System.out.println("2. Listar tareas");
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
                    // TODO Alumno B: opción 2 (listar)
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
