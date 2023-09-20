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
        assertEquals(-1, Main.discount(-1, 1));
        assertEquals(-1, Main.discount(1000, 1));
        assertEquals(0, Main.discount(0, 1));
        assertEquals(0, Main.discount(1, 1));
        assertEquals(0, Main.discount(3, 1));
        assertEquals(0, Main.discount(10, 1));


        /*
        Near-poor households test
         */
        assertEquals(-1, Main.discount(-1, 2));
        assertEquals(-1, Main.discount(1000, 2));
        assertEquals(0, Main.discount(0, 2));
        assertEquals(0, Main.discount(2, 2));
        assertEquals(10, Main.discount(3, 2));
        assertEquals(15, Main.discount(10, 2));

        /*
        Poor households test
         */
        assertEquals(-1, Main.discount(-1, 3));
        assertEquals(-1, Main.discount(1000, 3));
        assertEquals(0, Main.discount(0, 3));
        assertEquals(10, Main.discount(2, 3));
        assertEquals(15, Main.discount(4, 3));
        assertEquals(20, Main.discount(10, 3));
    }
}