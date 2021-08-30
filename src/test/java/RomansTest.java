import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomansTest {

    @Test
    public void shouldConvert1ToI() {
        assertEquals("I", Main.toRoman(1));
    }

    @Test
    public void shouldConvertTwoToII() {
        assertEquals("II", Main.toRoman(2));
    }

    @Test
    public void shouldConvertThreeToIII() {
        assertEquals("III", Main.toRoman(3));
    }

}
