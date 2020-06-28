package softwareTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirplaneTest {

    private Airplane airplane;

    @BeforeEach
    void setUp() {
        airplane = new Airplane();
    }

    @Test
    void thatInitiallyAirplaneHeightIsZero() {

        assertEquals(0, airplane.getHeight());
    }

    @Test
    void ascentHappyPath() {

        airplane.ascent(10);
        assertEquals(10, airplane.getHeight());

        airplane.ascent(25);
        assertEquals(35, airplane.getHeight());
    }

    @Test
    void descentHappyPack() {

        airplane.ascent(10);
        airplane.ascent(25);
        airplane.descent(5);
        assertEquals(30, airplane.getHeight());
    }

    @Test
    void thatLandingIsSafe() {
        airplane.ascent(35);
        airplane.descent(40);
        assertEquals(0, airplane.getHeight());
    }
}