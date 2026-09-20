/**
 *  
 * 
 * Clase que representa el Nodo del Árbol Binario de Búsqueda (ABB).
 * Cada instancia almacena los datos de un producto y las referencias a sus
 * nodos hijos.
 */
public class Producto {
    // Datos del producto
    int id;
String nombre;

    // Punteros/Referencias a los nodos hijos
    Producto izquierdo;
Producto derecho;

    /**
     *  
     * 
     * Constructor para inicializar un nuevo producto (nodo hoja).
     * Los punteros izquierdo y derecho se inicializan por defecto en null.
     */
    public Producto(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.izquierdo = null;
        this.derecho = null;
    }
}
