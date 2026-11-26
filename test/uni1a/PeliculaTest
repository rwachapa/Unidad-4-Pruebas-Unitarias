package uni1a;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PeliculaTest {

    @Test
    void crearPelicula_DatosCorrectos() {
        Pelicula pelicula = new Pelicula("El Bosque", 110, "Drama", "Estudio Norte");
        
        assertEquals("El Bosque", pelicula.getTitulo());
        assertEquals(110, pelicula.getDuracionEnMinutos());
        assertEquals("Drama", pelicula.getGenero());
        assertEquals("Estudio Norte", pelicula.getEstudio());
    }

    @Test
    void tituloNoEsNulo() {
        Pelicula pelicula = new Pelicula("Aventura", 95, "Aventura", "Estudio Sur");
        assertNotNull(pelicula.getTitulo());
    }

    @Test
    void duracionPositiva() {
        Pelicula pelicula = new Pelicula("Prueba", 85, "Comedia", "Estudio Central");
        assertTrue(pelicula.getDuracionEnMinutos() > 0);
    }
}
