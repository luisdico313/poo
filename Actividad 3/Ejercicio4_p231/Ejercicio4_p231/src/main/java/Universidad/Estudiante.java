package Universidad;

/**
 *
 * @author Usuario
 */
public class Estudiante extends Persona{
    
    // Atributos privados
    private String carrera;
    private int semestre;

    /**
     * Constructor de la clase Estudiante.
     * @param nombre El nombre del estudiante.
     * @param direccion La dirección del estudiante.
     * @param carrera La carrera que estudia el estudiante.
     * @param semestre El semestre en el que se encuentra el estudiante.
     */
    public Estudiante(String nombre, String direccion, String carrera, int semestre) {
        super(nombre, direccion); // Llama al constructor de la clase padre (Persona)
        this.carrera = carrera;
        this.semestre = semestre;
    }

    // Métodos getter
    public String getCarrera() {
        return carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    // Métodos setter
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    /**
     * Sobrescribe el método toString para proporcionar una representación en cadena del Estudiante.
     * Incluye la información de la Persona y los atributos específicos del Estudiante.
     * @return Una cadena que representa el Estudiante.
     */
    @Override
    public String toString() {
        return "Estudiante: " + super.toString() + ", Carrera: " + carrera + ", Semestre: " + semestre;
    }
        
}
