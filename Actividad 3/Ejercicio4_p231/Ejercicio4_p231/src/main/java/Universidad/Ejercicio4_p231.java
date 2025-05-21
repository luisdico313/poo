
package Universidad;

/**
 *
 * @author Usuario
 */
public class Ejercicio4_p231 {

    public static void main(String[] args) {
        
        // Crear objetos de las clases
        Persona persona1 = new Persona("Ana López", "Calle Falsa 123");
        Estudiante estudiante1 = new Estudiante("Juan Pérez", "Avenida Siempre Viva 742", "Ingeniería de Sistemas", 5);
        Profesor profesor1 = new Profesor("María García", "Carrera 45 #20-10", "Ciencias de la Computación", "Titular");

        // Imprimir información de los objetos utilizando el método toString()
        System.out.println("--- Información de las Personas en la Universidad ---");
        System.out.println(persona1);
        System.out.println(estudiante1);
        System.out.println(profesor1);

        System.out.println("\n--- Modificando datos de Estudiante ---");
        estudiante1.setCarrera("Ciencias de Datos");
        estudiante1.setSemestre(6);
        System.out.println("Estudiante modificado: " + estudiante1);

        System.out.println("\n--- Modificando datos de Profesor ---");
        profesor1.setCategoria("Asociado");
        System.out.println("Profesor modificado: " + profesor1);

        System.out.println("\n--- Accediendo a métodos específicos ---");
        System.out.println("Nombre del estudiante: " + estudiante1.getNombre());
        System.out.println("Carrera del estudiante: " + estudiante1.getCarrera());
        System.out.println("Departamento del profesor: " + profesor1.getDepartamento());
        
        
    }
}
