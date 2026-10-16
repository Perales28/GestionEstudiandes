/**
 * Clase Estudiante
 * Representa a un estudiante con sus datos basicos:
 * nombre, edad y promedio.
 * Esta clase demuestra la declaracion de atributos,
 * un constructor y metodos.
 */
public class Estudiante {

    // Atributos de la clase (datos que guarda cada objeto)
    private String nombre;
    private int edad;
    private double promedio;

    /**
     * Constructor de la clase.
     * Se ejecuta al crear un objeto Estudiante y
     * asigna los valores iniciales a los atributos.
     * @param nombre   Nombre del estudiante
     * @param edad     Edad del estudiante
     * @param promedio Promedio del estudiante
     */
    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    /**
     * Metodo mostrarDatos
     * Imprime en pantalla los datos del estudiante.
     */
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);
        System.out.println("Aprobado: " + estaAprobado());
    }

    /**
     * Metodo estaAprobado
     * Devuelve true si el promedio es mayor o igual a 6,
     * de lo contrario devuelve false.
     * @return true si esta aprobado, false si no
     */
    public boolean estaAprobado() {
        return promedio >= 6;
    }

    /**
     * Metodo principal (main)
     * Punto de entrada del programa. Aqui se instancian
     * dos objetos de la clase Estudiante y se prueban
     * sus metodos.
     */
    public static void main(String[] args) {
        // Instanciacion de dos objetos Estudiante
        Estudiante alumno1 = new Estudiante("Alan", 20, 8.5);
        Estudiante alumno2 = new Estudiante("Mich", 18, 6.2);

        // Prueba de los metodos de cada objeto
        System.out.println("--- Estudiante 1 ---");
        alumno1.mostrarDatos();

        System.out.println("--- Estudiante 2 ---");
        alumno2.mostrarDatos();
    }
}
