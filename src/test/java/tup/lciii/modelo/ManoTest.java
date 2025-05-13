package tup.lciii.modelo;

import org.junit.jupiter.api.Test;
import tup.lciii.modelo.enums.Palo;

import static org.junit.jupiter.api.Assertions.*;

class ManoTest {

    @Test
    void buscarCartaEnManoTest() {
        Mano mano = new Mano();
        mano.agregarCarta(new Carta(1, Palo.ORO));

        Carta result = mano.buscarCartaEnMano(1, Palo.ORO);

        assertNotNull(result);
        assertEquals(1, result.getNumero());
        assertEquals(Palo.ORO, result.getPalo());
    }

    @Test
    void buscarCartaEnManoFailTest() {
        Mano mano = new Mano();
        mano.agregarCarta(new Carta(1, Palo.ORO));

        Carta result = mano.buscarCartaEnMano(6, Palo.COPA);

        assertNull(result);
    }
}