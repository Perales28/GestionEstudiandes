// Clase Estudiante: representa a un estudiante con sus datos básicos
public class Estudiante {

    // Atributos (características del estudiante)
    private String nombre;
    private int edad;
    private double promedio;

    // Constructor: se ejecuta al crear un objeto, inicializa los atributos
    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    // Método para mostrar los datos del estudiante
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);
    }

    // Método que indica si el estudiante está aprobado
    public boolean estaAprobado() {
        return promedio >= 7.0;
    }

    // Programa principal: aquí se instancian los objetos y se prueban los métodos
    public static void main(String[] args) {
        // Instanciación de objetos a partir de la clase
        Estudiante alumno1 = new Estudiante("Alan", 20, 8.5);
        Estudiante alumno2 = new Estudiante("Mich", 18, 6.2);

        // Uso de los métodos
        System.out.println("--- Estudiante 1 ---");
        alumno1.mostrarDatos();
        System.out.println("Aprobado: " + alumno1.estaAprobado());

        System.out.println("--- Estudiante 2 ---");
        alumno2.mostrarDatos();
        System.out.println("Aprobado: " + alumno2.estaAprobado());
    }
}
