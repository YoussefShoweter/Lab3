import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ATMTest {

    public static ATM HSBC;
    public static HelperinATM HSBChelp;

    // Make sure class ATM extends ATMResStub
    @Nested
    class TopDown{
        @BeforeAll
        public static void init(){
            HSBC = new ATM();
            HSBChelp = new HelperinATM();
        }

        @Test
        public void first(){
            assertTrue(HSBC.input('l'));
        }


        @Test
        public void second(){
            assertFalse(HSBC.input('d'));
        }

        @Test
        public void third(){
            assertTrue(HSBC.input('o'));
        }

        @Test
        public void fourth(){
            assertTrue(HSBC.input('u'));
        }

        @Test
        public void fifth(){
            assertTrue(HSBC.input('f'));
        }

        @Test
        public void sixth(){
            assertTrue(HSBC.input('l'));
        }

        @Test
        public void seventh(){
            assertFalse(HSBChelp.TakeMoney());
            HSBChelp.AddFlow(1);
            assertTrue(HSBChelp.TakeMoney());
            assertFalse(HSBChelp.TakeMoney());
            HSBChelp.AddFlow(3);
            assertTrue(HSBChelp.TakeMoney());
            assertTrue(HSBChelp.TakeMoney());
            assertTrue(HSBChelp.TakeMoney());
        }

    }


    // Make sure class ATM extends ATMRes
    @Nested
    class BottomUp{
        @BeforeAll
        public static void init(){
            HSBC = new ATM();
            HSBChelp = new HelperinATM();
        }

        @Test
        public void initial(){
            assertFalse(HSBChelp.TakeMoney());
            HSBChelp.AddFlow(1);
            assertTrue(HSBChelp.TakeMoney());
            assertFalse(HSBChelp.TakeMoney());
            HSBChelp.AddFlow(3);
            assertTrue(HSBChelp.TakeMoney());
            assertTrue(HSBChelp.TakeMoney());
            assertTrue(HSBChelp.TakeMoney());
        }


        @Test
        public void first(){
            assertTrue(HSBC.input('l'));
        }

        @Test
        public void second(){
            assertFalse(HSBC.input('w'));
        }

        @Test
        public void third(){
            assertTrue(HSBC.input('d'));
        }

        @Test
        public void fourth(){
            assertFalse(HSBC.input('w'));
        }

        @Test
        public void fifth(){
            assertTrue(HSBC.input('o'));
        }

        @Test
        public void sixth(){
            assertFalse(HSBC.input('u'));
        }

        @Test
        public void seventh(){
            assertFalse(HSBC.input('f'));
        }

        @Test
        public void eights(){
            assertTrue(HSBC.input('l'));
        }

        @Test
        public void ninth(){
            assertFalse(HSBC.input('l'));
        }

    }

}