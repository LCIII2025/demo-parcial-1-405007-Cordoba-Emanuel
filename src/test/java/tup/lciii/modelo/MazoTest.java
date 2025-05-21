package tup.lciii.modelo;

import org.junit.jupiter.api.Test;
import tup.lciii.modelo.enums.Palo;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MazoTest {

    @Test
    void getMazoLengthTest() {
        Mazo mazo = new Mazo();
        mazo.agregarCarta(new Carta(1, Palo.ORO));
        mazo.agregarCarta(new Carta(1, Palo.COPA));
        mazo.agregarCarta(new Carta(1, Palo.ESPADA));
        mazo.agregarCarta(new Carta(1, Palo.BASTO));

        int result = mazo.getMazoLength();

        assertEquals(4, result);
    }

    @Test
    void mezclarMazoTest() {
        Mazo mazo = new Mazo();
        mazo.generarMazo();
        ArrayList<Carta> original = new ArrayList<>(mazo.getMazo());

        mazo.mezclarMazo();
        List<Carta> mezclado = mazo.getMazo();

        assertNotEquals(original, mezclado);
        assertEquals(original.size(), mezclado.size());
    }

    @Test
    void generarMazo() {
        Mazo mazo = new Mazo();
        mazo.generarMazo();

        assertNotNull(mazo);
        assertEquals(48, mazo.getMazoLength());
    }
}