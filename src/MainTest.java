import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    /*
    Subject:
    1 - Normal households
    2 - Near-poor households
    3 - Poor households
     */
    @org.junit.jupiter.api.Test
    void discount() {
        /*
        Normal households test
         */
        assertEquals(-1, Main.discount(-1, "normal"));
        assertEquals(-1, Main.discount(1000, "normal"));
        assertEquals(0, Main.discount(0, "normal"));
        assertEquals(0, Main.discount(1, "normal"));
        assertEquals(0, Main.discount(3, "normal"));
        assertEquals(0, Main.discount(10, "normal"));


        /*
        Near-poor households test
         */
        assertEquals(-1, Main.discount(-1, "nearpoor"));
        assertEquals(-1, Main.discount(1000, "nearpoor"));
        assertEquals(0, Main.discount(0, "nearpoor"));
        assertEquals(0, Main.discount(2, "nearpoor"));
        assertEquals(10, Main.discount(3, "nearpoor"));
        assertEquals(15, Main.discount(10, "nearpoor"));

        /*
        Poor households test
         */
        assertEquals(-1, Main.discount(-1, "poor"));
        assertEquals(-1, Main.discount(1000, "poor"));
        assertEquals(0, Main.discount(0, "poor"));
        assertEquals(10, Main.discount(2, "poor"));
        assertEquals(15, Main.discount(4, "poor"));
        assertEquals(20, Main.discount(10, "poor"));
    }
}