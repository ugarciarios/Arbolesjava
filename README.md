# 🌳 Sistema de Inventario "Tree-Stock"

## 🎯 Objetivo
El objetivo de este proyecto es comprender y aplicar el concepto de **Árbol Binario de Búsqueda (ABB)** y su estructura lógica mediante la implementación manual de una estructura dinámica en **Java**. El sistema actúa como un control de inventario y clasificación de productos ordenados por su ID.

---

## 👥 Sustentación
Se presenta la explicación individual sobre la lógica de los punteros en el árbol (máximo 3 minutos):

* **[Nombre del Integrante 1]** - [Enlace al Video de Sustentación 1]

---

## 💻 Requisitos de Ejecución
* **Entorno de Desarrollo:** VS Code
* **JDK:** Eclipse Temurin (Versión 17 o superior recomendada)
* **Lenguaje:** Java

### Instrucciones de Ejecución
1. Clone este repositorio:
   ```bash
   git clone [URL_DE_TU_REPOSITORIO]
   ```
2. Abra la carpeta del proyecto en **VS Code**.
3. Asegúrese de tener instalada la extensión *Extension Pack for Java*.
4. Ejecute la clase `Main.java`.

---

## 🛠️ Estructura del Código

El proyecto está dividido estrictamente en tres clases dinámicas:
* **`Producto.java` (El Nodo):** Contiene el `id`, `nombre` y los punteros de autoreferencia `izquierdo` y `derecho`.
* **`ArbolInventario.java` (La Lógica):** Contiene los métodos recursivos de `Insertar`, `Buscar` y `Recorrido Inorden`.
* **`Main.java` (La Interfaz):** Menú interactivo en consola mediante `switch-case`.

---

## 📸 Evidencias de Ejecución (Capturas de Pantalla)

### 1. Menú Principal
Aquí se muestra la interfaz inicial del sistema en consola.
![Menú Principal](![alt text](image.png))

### 2. Registrar / Insertar Producto
Ejemplo de inserción de productos con IDs desordenados para verificar la lógica del árbol.
![Registro de Producto](![alt text](image-1.png))

### 3. Mostrar Inventario (Recorrido Inorden)
Demostración de cómo el sistema lista los productos organizados de menor a mayor automáticamente por su ID.
![Recorrido Inorden](![alt text](image-2.png))

### 4. Buscar Producto
Prueba de búsqueda exitosa y fallo cuando el ID no existe en el sistema.
![Búsqueda de Producto](![alt text](image-3.png))
