
import static org.junit.Assert.*;
import org.junit.Test;

public class AutoTest
{
    @Test
    public void testPsZuKlein()
    {
        Auto auto = new Auto("VW", 10, false);

        assertEquals(20, auto.getPs());
    }

    @Test
    public void testPsGrenzeUnten()
    {
        Auto auto = new Auto("VW", 20, false);

        assertEquals(20, auto.getPs());
    }

    @Test
    public void testPsGrenzeOben()
    {
        Auto auto = new Auto("VW", 1500, false);

        assertEquals(1500, auto.getPs());
    }

    @Test
    public void testPsZuGross()
    {
        Auto auto = new Auto("VW", 1600, false);

        assertEquals(20, auto.getPs());
    }
}