/**
 *  
 * 
 * Clase que gestiona la lógica del Árbol Binario de Búsqueda para el
 * inventario.
 */
public class ArbolInventario {
    // Raíz del árbol
    private Producto raiz;

    public ArbolInventario() {
        this.raiz = null;
    }

    // --- MÉTODO INSERTAR (Punto de entrada público) ---
    public void insertar(int id, String nombre) {
        raiz = insertarRecursivo(raiz, id, nombre);
    }

    /**
     *  
     * 
     * Método recursivo para insertar un producto en la posición correcta según su
     * ID.
     */
    private Producto insertarRecursivo(Producto actual, int id, String nombre) {
        // Caso base: Si encontramos una posición vacía (null), creamos el nodo aquí
        if (actual == null) {
            return new Producto(id, nombre);
        }

        // Si el ID es menor, avanzamos/insertamos en el subárbol izquierdo
        if (id < actual.id) {
            actual.izquierdo = insertarRecursivo(actual.izquierdo, id, nombre);
        }
        // Si el ID es mayor, avanzamos/insertamos en el subárbol derecho
        else if (id > actual.id) {
            actual.derecho = insertarRecursivo(actual.derecho, id, nombre);
        }
        // Si el ID es igual, no se inserta (evita duplicados en el inventario)
        else {
            System.out.println(" Error: El ID " + id + " ya existe en el inventario.");
        }

        return actual;
    }

    // --- MÉTODO RECORRIDO INORDEN (Punto de entrada público) ---
    public void recorridoInorden() {
        if (raiz == null) {
            System.out.println(" El inventario está vacío.");
        } else {
            inordenRecursivo(raiz);
        }
    }

    /**
     *  
     * 
     * Recorre el árbol en orden: Izquierda -> Raíz -> Derecha.
     * Esto garantiza que los productos se listen de forma ordenada ascendentemente
     * por ID.
     */
    private void inordenRecursivo(Producto actual) {
        if (actual != null) {
            inordenRecursivo(actual.izquierdo); // Visita hijo izquierdo
            System.out.println(" [ID: " + actual.id + "] Nombre: " + actual.nombre); // Visita raíz
            inordenRecursivo(actual.derecho); // Visita hijo derecho
        }
    }

    // --- MÉTODO BUSCAR (Punto de entrada público) ---
    public Producto buscar(int id) {
        return buscarRecursivo(raiz, id);
    }

    /**
     *  
     * 
     * Método recursivo que busca un producto por su ID aprovechando la propiedad
     * del ABB.
     */
    private Producto buscarRecursivo(Producto actual, int id) {
        // Caso base: No se encontró (null) o se encontró el ID correspondiente
        if (actual == null || actual.id == id) {
            return actual;
        }

        // Si el ID buscado es menor, buscamos en la izquierda
        if (id < actual.id) {
            return buscarRecursivo(actual.izquierdo, id);
        }

        // Si el ID buscado es mayor, buscamos en la derecha
        return buscarRecursivo(actual.derecho, id);
    }
}
