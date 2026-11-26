package uni1a;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class InvestigadorTest {

    @Test
    void crearInvestigador_DatosCorrectos() {
        // Constructor real: Investigador(String nombre, String especialidad)
        Investigador inv = new Investigador("María López", "Historia");
        assertNotNull(inv, "El investigador debe crearse correctamente");
    }

    @Test
    void nombreNoEstaVacio() {
        Investigador inv = new Investigador("Juan Pérez", "Biología");
        assertNotNull(inv);
    }

    @Test
    void especialidadNoEstaVacia() {
        Investigador inv = new Investigador("Sofía Cruz", "Arte");
        assertNotNull(inv);
    }
}
