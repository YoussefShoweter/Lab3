import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitalWatchTest {

    public static DigitalWatch Fossil;
    public static DigitalHelper FossilHelper;

    // Make sure class DigitalWatch extends AlarmModStub
    @Nested
    class TopDown{
        @BeforeAll
        public static void init(){
            Fossil = new DigitalWatch();
            FossilHelper = new DigitalHelper();
        }

        @Test
        public void first(){
            assertTrue(Fossil.input('t'));
        }

        @Test
        public void second(){
            assertTrue(Fossil.input('a'));
        }

        @Test
        public void third(){
            assertTrue(Fossil.input('s'));
        }

        @Test
        public void fourth(){
            assertFalse(Fossil.input('c'));
        }

        @Test
        public void fifth(){
            assertTrue(Fossil.input('t'));
        }

        @Test
        public void sixth(){
            assertTrue(Fossil.input('s'));
        }

        @Test
        public void seventh(){
            assertTrue(Fossil.input('s'));
        }

        @Test
        public void eight(){
            assertFalse(Fossil.input('m'));
        }

        @Test
        public void nine(){
            assertFalse(Fossil.input('D'));
        }





        @Test
        public void HelperTest(){
            assertFalse(FossilHelper.checking());
            assertFalse(FossilHelper.unput());
            assertTrue(FossilHelper.put());
            assertTrue(FossilHelper.checking());
            assertTrue(FossilHelper.put());
            assertFalse(FossilHelper.put());
            assertTrue(FossilHelper.unput());
        }

    }


    // Make sure class DigitalWatch extends AlarmMod
    @Nested
    class BottomUp {
        @BeforeAll
        public static void init() {
            Fossil = new DigitalWatch();
            FossilHelper = new DigitalHelper();
        }

        @Test
        public void HelperTest() {
            assertFalse(FossilHelper.checking());
            assertFalse(FossilHelper.unput());
            assertTrue(FossilHelper.put());
            assertTrue(FossilHelper.checking());
            assertTrue(FossilHelper.put());
            assertFalse(FossilHelper.put());
            assertTrue(FossilHelper.unput());
        }


        @Test
        public void one(){
            assertTrue(Fossil.input('t'));
        }

        @Test
        public void two(){
            assertTrue(Fossil.input('a'));
        }

        @Test
        public void three(){
            assertTrue(Fossil.input('s'));
        }

        @Test
        public void four(){
            assertTrue(Fossil.input('c'));
        }

        @Test
        public void five(){
            assertTrue(Fossil.input('s'));
        }

        @Test
        public void six(){
            assertFalse(Fossil.input('u'));
        }

        @Test
        public void seven(){
            assertTrue(Fossil.input('t'));
        }

        @Test
        public void eight(){
            assertTrue(Fossil.input('s'));
        }


    }

}