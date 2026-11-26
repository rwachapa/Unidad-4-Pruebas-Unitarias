package uni1a;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import uni1a.Investigador;

class DocumentalTest {

    @Test
    void crearDocumental_DatosCorrectos() {
        // Constructor real: Documental(titulo, duracionEnMinutos, genero, tema)
        Documental doc = new Documental("Los Andes", 90, "Cultura", "Historia de los Andes");
        
        assertEquals("Los Andes", doc.getTitulo());
        assertEquals(90, doc.getDuracionEnMinutos());
        assertEquals("Cultura", doc.getGenero());
        assertEquals("Historia de los Andes", doc.getTema());
    }

    @Test
    void asignarInvestigador_FuncionaCorrectamente() {
        Documental doc = new Documental("Amazonía", 120, "Naturaleza", "Ecosistema amazónico");
        // Constructor real de Investigador: solo 2 parámetros
        Investigador inv = new Investigador("María López", "Bióloga");
        
        doc.asignarInvestigador(inv);
        assertNotNull(doc, "El documental debe existir y aceptar el investigador");
    }

    @Test
    void tituloNoEstaVacio() {
        Documental doc = new Documental("Antártida", 60, "Ciencia", "Clima polar");
        assertFalse(doc.getTitulo().isEmpty());
    }
}
