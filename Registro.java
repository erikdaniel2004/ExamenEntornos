/**
 * Clase de pruebas para la clase Persona.
 * <p>
 * Verifica los métodos getDNI y getEdad de la clase Persona.
 * </p>
 * 
 * @autor Daniel Expósito Seoane
 * @version 1.0
 */

 // Importación de los paquetes necesarios para la gestión del programa
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

// Inicio de la clase Persona donde guardar cada dato establecido en la clase Registro
class Persona {
    private String dni;
    private String correo;
    private String contrasena;
    private String nombre;
    private String apellidos;
    private String direccionPostal;
    private String codigoPostal;
    private String telefono;
    private int edad;

    
    /** 
     * Representa el dni del usuario
     * @return String
     */
    public String getDni() {
        return dni;
    }


    
    /** 
     * Representa el correo del usuario
     * @return String
     */
    public String getCorreo() {
        return correo;
    }


    
    /** 
     * Representa la contraseña del usuario
     * @return String
     */
    public String getContrasena() {
        return contrasena;
    }


    
    /** 
     * Representa el nombre del usuario
     * @return String
     */
    public String getNombre() {
        return nombre;
    }


    
    /** 
     * Representa los apellidos del usuario
     * @return String
     */
    public String getApellidos() {
        return apellidos;
    }


    
    /** 
     * Representa la dirección postal del usuario
     * @return String
     */
    public String getDireccionPostal() {
        return direccionPostal;
    }


    
    /** 
     * Representa el código postal del usuario
     * @return String
     */
    public String getCodigoPostal() {
        return codigoPostal;
    }


    
    /** 
     * Representa el teléfono del usuario
     * @return String
     */
    public String getTelefono() {
        return telefono;
    }


    
    /** 
     * Representa la edad del usuario
     * @return int
     */
    public int getEdad() {
        return edad;
    }
    /** 
     * Establece que el DNI debe seguir con un patrón determiando de hasta 8 dígitos y si no no será válido
     * @param dni
     * @return boolean
     */
    public boolean setDni(String dni) {
        if (dni.matches("\\d{8}")) {
            this.dni = dni;
            return true;
        } else {
            System.out.println("DNI no válido. Debe tener 8 dígitos.");
            return false;
        }
    }

    
    /** 
     * Establece que el correo debe seguir con un patrón determinado como www.cualquiercaracter@cualquierextencion.com
     * @param correo
     * @return boolean
     */
    public boolean setCorreo(String correo) {
        String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(correo);
        if (matcher.matches()) {
            this.correo = correo;
            return true;
        } else {
            System.out.println("Correo electrónico no válido.");
            return false;
        }
    }

    
    /** 
     * Establece la contraseña según los requisitos los cuales indican que esta debe ser mayor de 8 caracteres
     * @param contrasena
     * @return boolean
     */
    public boolean setContrasena(String contrasena) {
        if (contrasena.length() > 8) {
            this.contrasena = contrasena;
            return true;
        } else {
            System.out.println("Contraseña no válida. Debe tener más de 8 caracteres.");
            return false;
        }
    }

    /** 
     * Establece el nombre del usuario
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
    
    /** 
     * Establece los apellidos del usuario
     * @param apellidos
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    
    /** 
     * Establece la dirección postal del usuario
     * @param direccionPostal
     */
    public void setDireccionPostal(String direccionPostal) {
        this.direccionPostal = direccionPostal;
    }

    
    /** 
     * Establece el código postal del usuario
     * @param codigoPostal
     */
    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    
    /** 
     * Establece el teléfono del usuario
     * @param telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
    
    /** 
     * Establece la edad para que cumpla con los requisitos de ser mayor de 18 años
     * @param edad
     * @return boolean
     */
    public boolean setEdad(int edad) {
        if (edad >= 18) {
            this.edad = edad;
            return true;
        } else {
            System.out.println("Debes ser mayor de 18 años.");
            return false;
        }
    }

    
    
    /** 
     * Devuelve el contenido de todos los datos del usuario
     * @return String
     */
    @Override
    public String toString() {
        return "DNI: " + dni + "\n" +
               "Correo: " + correo + "\n" +
               "Nombre: " + nombre + "\n" +
               "Apellidos: " + apellidos + "\n" +
               "Dirección Postal: " + direccionPostal + "\n" +
               "Código Postal: " + codigoPostal + "\n" +
               "Teléfono: " + telefono + "\n" +
               "Edad: " + edad;
    }
}

// Declaración de la clase Registro donde representaremos los datos introducidos por el usuario en el sistema
public class Registro {

    // Inicio de la gestion del programa con los datos
    public static void main(String[] args) {

        // Cada vez que se metan datos nuevos se creará una nueva persona
        Scanner scanner = new Scanner(System.in);
        Persona persona = new Persona();

        // Se pedirá el DNI
        System.out.print("Ingrese el DNI: ");
        while (!persona.setDni(scanner.nextLine()));

        // Se pedirá el correo
        System.out.print("Ingrese el correo electrónico: ");
        while (!persona.setCorreo(scanner.nextLine()));

        // Se pedirá la contraseña
        System.out.print("Ingrese la contraseña: ");
        while (!persona.setContrasena(scanner.nextLine()));

        // Se pedirá el nombre
        System.out.print("Ingrese el nombre: ");
        persona.setNombre(scanner.nextLine());

        // Se pedirán los apellidos
        System.out.print("Ingrese los apellidos: ");
        persona.setApellidos(scanner.nextLine());

        // Se pedirá la dirección postal
        System.out.print("Ingrese la dirección postal: ");
        persona.setDireccionPostal(scanner.nextLine());

        // Se pedirá el código postal
        System.out.print("Ingrese el código postal: ");
        persona.setCodigoPostal(scanner.nextLine());

        // Se pedirá el teléfono
        System.out.print("Ingrese el teléfono: ");
        persona.setTelefono(scanner.nextLine());

        // Se pedirá la edad
        System.out.print("Ingrese la edad: ");
        while (!persona.setEdad(scanner.nextInt()));

        // Se indicará por mensaje que los datos son válidos y el registro se ha llevado a cabo
        System.out.println("Registro exitoso!");

        // Se muestran todos los datos introducidos por el usuario en pantalla
        System.out.println("Detalles del usuario:");
        System.out.println(persona);

        // Cierre del scanner que permite la entrada de datos
        scanner.close();
    }
}
