package Universidad;

/**
 *
 * @author Usuario
 */
public class Persona {
    
    // Atributos privados
    private String nombre;
    private String direccion;

    /**
     * Constructor de la clase Persona.
     * @param nombre El nombre de la persona.
     * @param direccion La dirección de la persona.
     */
    public Persona(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    // Métodos getter
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    // Métodos setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Sobrescribe el método toString para proporcionar una representación en cadena de la Persona.
     * @return Una cadena que representa la Persona.
     */
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Dirección: " + direccion;
    }
    
    
    
}
