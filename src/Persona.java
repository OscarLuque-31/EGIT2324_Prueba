public class Persona {
    // Propiedades
    private String nombre;
    private String apellidos;
    private int edad;

    // Constructor
    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    // Método Cumpleaños
    public void Cumpleaños() {
        edad++; // Aumenta la edad en 1
        System.out.println("¡Feliz cumpleaños! Ahora tienes " + edad + " años.");
    }

    // Getters y setterss
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método toString para representación textual de la persona
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                '}';
    }
 // Método DatosPersona
    public void DatosPersona() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Edad: " + edad);
    }
}
