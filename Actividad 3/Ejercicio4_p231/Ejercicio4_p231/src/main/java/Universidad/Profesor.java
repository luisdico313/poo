
package Universidad;

/**
 *
 * @author Usuario
 */
public class Profesor extends Persona{
    
    // Atributos privados
    private String departamento;
    private String categoria;

    /**
     * Constructor de la clase Profesor.
     * @param nombre El nombre del profesor.
     * @param direccion La dirección del profesor.
     * @param departamento El departamento al que pertenece el profesor.
     * @param categoria La categoría del profesor (ej. asociado, titular).
     */
    public Profesor(String nombre, String direccion, String departamento, String categoria) {
        super(nombre, direccion); // Llama al constructor de la clase padre (Persona)
        this.departamento = departamento;
        this.categoria = categoria;
    }

    // Métodos getter
    public String getDepartamento() {
        return departamento;
    }

    public String getCategoria() {
        return categoria;
    }

    // Métodos setter
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Sobrescribe el método toString para proporcionar una representación en cadena del Profesor.
     * Incluye la información de la Persona y los atributos específicos del Profesor.
     * @return Una cadena que representa el Profesor.
     */
    @Override
    public String toString() {
        return "Profesor: " + super.toString() + ", Departamento: " + departamento + ", Categoría: " + categoria;
    }
    
    
}
