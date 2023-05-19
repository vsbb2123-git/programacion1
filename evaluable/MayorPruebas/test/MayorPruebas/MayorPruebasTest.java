package MayorPruebas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MayorPruebasTest {
    
    public MayorPruebasTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    @AfterClass
    public static void tearDownClass() {
    }
    @Before
    public void setUp() {
    }
    @After
    public void tearDown() {
    }
    @Test
    public void testAscA() {
        System.out.println("testAscA");
        int[] lista = new int[]{1,2,3,4,5,6,7,8,9};
        int expResult = 9;
        int result = MayorPruebas.mayorA(lista);
        assertEquals(expResult, result);
    }
    @Test
    public void testAscB() {
        System.out.println("testAscB");
        int[] lista = new int[]{1,2,3,4,5,6,7,8,9};
        int expResult = 9;
        int result = MayorPruebas.mayorB(lista);
        assertEquals(expResult, result);
    }    
    @Test
    public void testAscrepeA() {
        System.out.println("testAscrepeA");
        int[] lista = new int[]{1,2,3,3,4,5,6,7,7,8,9};
        int expResult = 89;
        int result = MayorPruebas.mayorA(lista);
        assertEquals(expResult, result);
    }
    @Test
    public void testAscrepeB() {
        System.out.println("testAscrepeB");
        int[] lista = new int[]{1,2,3,3,4,5,6,7,7,8,9};
        int expResult = 89;
        int result = MayorPruebas.mayorB(lista);
        assertEquals(expResult, result);
    }
    @Test
    public void testDescA() {
        System.out.println("testDescA");
        int[] lista = new int[]{9,8,7,6,5,4,2,1};
        int expResult = 9;
        int result = MayorPruebas.mayorA(lista);
        assertEquals(expResult, result);
    }
    @Test
    public void testDescB() {
        System.out.println("testDescB");
        int[] lista =new int[]{9,8,7,6,5,4,2,1};
        int expResult = 9;
        int result = MayorPruebas.mayorB(lista);
        assertEquals(expResult, result);
    }
    @Test
    public void testDescrepeA() {
        System.out.println("testDescrepeA");
        int[] lista = new int[]{9,8,7,6,6,5,4,4,2,1};
        int expResult = 9;
        int result = MayorPruebas.mayorA(lista);
        assertEquals(expResult, result);
    }
    @Test
    public void testDescrepeB() {
        System.out.println("testDescrepeB");
        int[] lista =new int[]{9,8,7,6,6,5,4,4,2,1};
        int expResult = 9;
        int result = MayorPruebas.mayorB(lista);
        assertEquals(expResult, result);
    }
    @Test
    public void testaleatA() {
        System.out.println("testaleatA");
        int[] lista = new int[]{65,98,654,2,54,74};
        int expResult = 654;
        int result = MayorPruebas.mayorA(lista);
        assertEquals(expResult, result);
    }
    @Test
    public void testaleatB() {
        System.out.println("testaleatB");
        int[] lista = new int[]{65,98,654,2,54,74};
        int expResult = 654;
        int result = MayorPruebas.mayorB(lista);
        assertEquals(expResult, result);
    }
    @Test
    public void testaleatrepeA() {
        System.out.println("testaleatrepeA");
        int[] lista = new int[]{2,54,84,84,52,3,21,45,45,7};
        int expResult = 84;
        int result = MayorPruebas.mayorA(lista);
        assertEquals(expResult, result);
    }
    @Test
    public void testaleatrepeB() {
        System.out.println("testaleatrepeB");
        int[] lista = new int[]{2,54,84,84,52,3,21,45,45,7};
        int expResult = 84;
        int result = MayorPruebas.mayorB(lista);
        assertEquals(expResult, result);
    }
    @Test
    public void testsolounoA() {
        System.out.println("testsolounoA");
        int[] lista =new int[]{32};
        int expResult = 32;
        int result = MayorPruebas.mayorA(lista);
        assertEquals(expResult, result);
    }
    @Test
    public void testsolounoB() {
        System.out.println("testsolounoB");
        int[] lista = new int[]{32};
        int expResult = 32;
        int result = MayorPruebas.mayorB(lista);
        assertEquals(expResult, result);
    }
    
}
