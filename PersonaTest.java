import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Clase de pruebas para la clase Persona.
 * <p>
 * Verifica los métodos getDNI y getEdad de la clase Persona.
 * </p>
 * 
 * @autor [Tu Nombre]
 * @version 1.0
 */
public class PersonaTest {

    /**
     * Prueba que verifica el método getDNI.
     */
    @Test
    public void testGetDNI() {
        Persona persona = new Persona("12345678A", 25);
        String resultado = persona.getDNI();
        assertEquals("12345678A", resultado);  // Resultado esperado: 12345678A
    }

    /**
     * Prueba que verifica el método getEdad.
     */
    @Test
    public void testGetEdad() {
        Persona persona = new Persona("12345678A", 25);
        int resultado = persona.getEdad();
        assertEquals(25, resultado);  // Resultado esperado: 25
    }
}

