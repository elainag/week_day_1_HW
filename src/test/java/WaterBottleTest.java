import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class WaterBottleTest {
    WaterBottle  waterbottle;

    @Before
    public void before(){
        waterbottle = new WaterBottle(true, 100, 10);

    }

    @Test
    public void whenCheckingWaterBottleItContainsAVolume(){

        assertTrue(waterbottle.getVolStatus());
    }
    @Test
    public void whenCheckingWaterBottleItsVolumeIs100(){
        assertEquals(100, waterbottle.getVolume(100));
    }

    @Test
    public void whenTakingADrinkItRemoves10FromTheTotalVolume(){
        assertEquals(90, waterbottle.takeDrink(10));
    }
    @Test
    public void whenTheBottleIsEmptyTheVolumeIsZero() {
        assertEquals(0, waterbottle.setEmpty(100));
    }
    @Test
    public void whenTheBottleIsEmptyFillItAgain(){
        assertEquals(100, waterbottle.fillBottle(100));
    }


}
