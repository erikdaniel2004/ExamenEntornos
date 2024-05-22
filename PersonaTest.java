import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

/**
 * Clase de pruebas para la clase Persona.
 * <p>
 * Verifica los métodos setDni y setEdad de la clase Persona.
 * </p>
 * 
 * @autor Daniel Expósito Seoane
 * @version 1.0
 */
public class PersonaTest {

    /**
     * Prueba que verifica el método setDni con un DNI válido.
     */
    @Test
    public void testSetDniValido() {
        Persona persona = new Persona();
        boolean resultado = persona.setDni("12345678");
        assertTrue(resultado);  // Resultado esperado: true
        assertEquals("12345678", persona.getDni());  // Verifica que el DNI se haya asignado correctamente
    }

    /**
     * Prueba que verifica el método setDni con un DNI inválido.
     */
    @Test
    public void testSetDniInvalido() {
        Persona persona = new Persona();
        boolean resultado = persona.setDni("");
        assertFalse(resultado);  // Resultado esperado: false
        assertEquals(null, persona.getDni());  // Verifica que el DNI no se haya asignado
    }

    /**
     * Prueba que verifica el método setEdad con una edad válida.
     */
    @Test
    public void testSetEdadValida() {
        Persona persona = new Persona();
        boolean resultado = persona.setEdad(25);
        assertTrue(resultado);  // Resultado esperado: true
        assertEquals(25, persona.getEdad());  // Verifica que la edad se haya asignado correctamente
    }

    /**
     * Prueba que verifica el método setEdad con una edad inválida.
     */
    @Test
    public void testSetEdadInvalida() {
        Persona persona = new Persona();
        boolean resultado = persona.setEdad(-5);
        assertFalse(resultado);  // Resultado esperado: false
        assertEquals(0, persona.getEdad());  // Verifica que la edad no se haya asignado (asumiendo que el valor por defecto es 0)
    }
}
