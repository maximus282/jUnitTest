import org.junit.*;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

public class MyUnitTest {

    @Test

    public void testConcatenate() {
        MyTest myUnit = new MyTest();

        String result = myUnit.concatenate("one", "two");

        assertEquals("onetwo", result);

    }




    @Test
    public void testDodawania(){
        MyTest myUnit = new MyTest();
        int wynik = myUnit.dodawanie(3,4);
        assertEquals(7,wynik);
    }
}