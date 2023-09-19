import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void discount() {
        /*
        Normal households test
         */
        assertEquals(-1, Main.discount(-1, 1));
        assertEquals(-1, Main.discount(100, 1));
        assertEquals(0, Main.discount(0, 1));
        assertEquals(0, Main.discount(2, 1));
        assertEquals(0, Main.discount(4, 1));
        assertEquals(10, Main.discount(5, 1));
        assertEquals(15, Main.discount(5, 1));
        assertEquals(0, Main.discount(20, 1));


        /*
        Near-poor households test
         */
        assertEquals(-1, Main.discount(-1, 2));
        assertEquals(-1, Main.discount(100, 2));
        assertEquals(0, Main.discount(0, 2));
        assertEquals(0, Main.discount(2, 2));
        assertEquals(10, Main.discount(4, 2));
        assertEquals(15, Main.discount(20, 2));
        assertEquals(10, Main.discount(4, 2));
        assertEquals(20, Main.discount(40, 2));

        /*
        Poor households test
         */
        assertEquals(-1, Main.discount(-1, 3));
        assertEquals(-1, Main.discount(100, 3));
        assertEquals(0, Main.discount(0, 3));
        assertEquals(10, Main.discount(2, 3));
        assertEquals(15, Main.discount(4, 3));
        assertEquals(20, Main.discount(20, 3));
    }
}