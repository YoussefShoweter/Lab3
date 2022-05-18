import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoffeeMachineTest {

    public static CoffeeMachine Youssef;
    public static Options Showeter;

    @Nested
    class TopDown{
        @BeforeAll
        public static void init(){
            Youssef = new CoffeeMachine();
            Showeter = new Options();
        }



        @Test
        public void one(){
            assertFalse(Youssef.input('r'));
        }

        @Test
        public void two(){
            assertFalse(Youssef.input('c'));
        }

        @Test
        public void three(){
            assertFalse(Youssef.input('m'));
        }

        @Test
        public void four(){
            assertFalse(Youssef.input('w'));
        }

        @Test
        public void five(){
            assertFalse(Youssef.input('b'));
        }


        @Test
        public void HelperTest(){
            assertFalse(Showeter.OrderMocha());
            assertFalse(Showeter.AddSparkleF());
            assertFalse(Showeter.PourFrenchV());
            assertFalse(Showeter.SmashLotus());
            Showeter.AddMocha(1);
            Showeter.AddSparkleWaterFizz(1);
            Showeter.AddFrenchVanilla(1);
            Showeter.AddLotus(1);
            assertTrue(Showeter.OrderMocha());
            assertTrue(Showeter.AddSparkleF());
            assertTrue(Showeter.PourFrenchV());
            assertTrue(Showeter.SmashLotus());
        }

    }


    @Nested
    class BottomUp{
        @BeforeAll
        public static void init(){
            Youssef = new CoffeeMachine();
            Showeter = new Options();
        }

        @Test
        public void HelperTest(){
            assertFalse(Showeter.OrderMocha());
            assertFalse(Showeter.AddSparkleF());
            assertFalse(Showeter.PourFrenchV());
            assertFalse(Showeter.SmashLotus());
            Showeter.AddMocha(1);
            Showeter.AddSparkleWaterFizz(1);
            Showeter.AddFrenchVanilla(1);
            Showeter.AddLotus(1);
            assertTrue(Showeter.OrderMocha());
            assertTrue(Showeter.AddSparkleF());
            assertTrue(Showeter.PourFrenchV());
            assertTrue(Showeter.SmashLotus());
        }


        @Test
        public void first(){
            assertFalse(Youssef.input('c'));
        }

        @Test
        public void Second(){
            assertFalse(Youssef.input('l'));
        }

        @Test
        public void Third(){
            assertFalse(Youssef.input('m'));
        }

        @Test
        public void Fourth(){
            assertFalse(Youssef.input('l'));
        }

        @Test
        public void Fifth(){
            assertFalse(Youssef.input('c'));
        }

        @Test
        public void Sixth(){
            assertFalse(Youssef.input('m'));
        }

        @Test
        public void Seventh(){
            assertFalse(Youssef.input('w'));
        }



    }

}