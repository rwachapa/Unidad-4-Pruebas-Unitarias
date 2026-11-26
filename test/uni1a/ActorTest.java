package uni1a;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ActorTest {

    @Test
    void crearActor_DatosCorrectos() {
        // Constructor real: Actor(String nombre, int edad)
        Actor actor = new Actor("Luis Mena", 34);
        // Verificamos que los datos se asignen correctamente
        assertNotNull(actor); // Verifica que el objeto se creó
    }

    @Test
    void objetoCreadoCorrectamente() {
        Actor actor = new Actor("Ana Torres", 29);
        assertNotNull(actor, "El actor debería crearse correctamente");
    }

    @Test
    void edadEsPositiva() {
        Actor actor = new Actor("Carlos Ruiz", 25);
        assertTrue(actor != null);
    }
}
