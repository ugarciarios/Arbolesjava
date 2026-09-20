import java.util.Scanner;

/**
 *  
 * 
 * Clase Principal que maneja la interfaz de usuario por consola (Menú
 * interactivo).
 */
public class Main {
    public static void main(String[] genealogy) {
        ArbolInventario inventario = new ArbolInventario();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== SISTEMA DE INVENTARIO TREE-STOCK ===");
            System.out.println("1. Registrar Producto");
            System.out.println("2. Mostrar Inventario (Inorden)");
            System.out.println("3. Buscar Producto");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            while (!scanner.hasNextInt()) {
                System.out.print(" Por favor, ingrese un número válido: ");
                scanner.next();
            }
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el ID del producto (Entero): ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Limpiar buffer
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = scanner.nextLine();

                    inventario.insertar(id, nombre);
                    System.out.println(" Intento de registro completado.");
                    break;

                case 2:
                    System.out.println("\n--- LISTADO DE PRODUCTOS (ORDENADOS POR ID) ---");
                    inventario.recorridoInorden();
                    break;

                case 3:
                    System.out.print("Ingrese el ID del producto a buscar: ");
                    int idBuscar = scanner.nextInt();

                    Producto encontrado = inventario.buscar(idBuscar);
                    if (encontrado != null) {
                        System.out.println(
                                " ¡Producto Encontrado! -> ID: " + encontrado.id + ", Nombre: " + encontrado.nombre);
                    } else {
                        System.out.println(" El producto con ID " + idBuscar + " NO existe en el inventario.");
                    }
                    break;

                case 0:
                    System.out.println(" Saliendo del sistema Tree-Stock. ¡Hasta luego!");
                    break;

                default:
                    System.out.println(" Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 0);

        scanner.close();

    }
}
