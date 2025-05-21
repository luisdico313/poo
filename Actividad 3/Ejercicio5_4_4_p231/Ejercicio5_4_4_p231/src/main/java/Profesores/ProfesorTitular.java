
package Profesores;

/**
 *
 * @author Usuario
 */
public class ProfesorTitular extends Profesor{
    /**
    * Método que sobreescribe el método imprimir heredado de la clase
    * padre Profesor
    */
    protected void imprimir() {
        System.out.println("Es un profesor titular.");
    }
    
}
