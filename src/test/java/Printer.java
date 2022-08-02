import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class Printer {
    Printer printer;

    @Before
    public void before(){
        printer = new Printer();
    }

    @Test
    public void whenPrinterInitialisesCheckItHasPaper(){
        assertTrue(printer.hasPaper());
    }

    private boolean hasPaper() {
    }


}
