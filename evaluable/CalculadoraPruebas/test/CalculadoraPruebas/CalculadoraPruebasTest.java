package CalculadoraPruebas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sergio Badal <s.badalcarsi@edu.gva.es>
 */
public class CalculadoraPruebasTest {
    
    public CalculadoraPruebasTest() {
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
    public void testSuma() {
        System.out.println("suma");
        CalculadoraPruebas instance = new CalculadoraPruebas (30,20);
        int expResult = 50;
        int result = instance.suma();
        assertEquals("Falla la suma", expResult, result);
    }

    @Test
    public void testResta() {
        System.out.println("resta");
        CalculadoraPruebas instance =new CalculadoraPruebas (30,20);
        int expResult = 10;
        int result = instance.resta();
        assertEquals("Falla la resta", expResult, result);
    }

    @Test
    public void testMultiplica() {
        System.out.println("multiplica");
        CalculadoraPruebas instance = new CalculadoraPruebas (2,2);
        int expResult = 4;
        int result = instance.multiplica();
        assertEquals("Falla la multiplicación", expResult, result);
    }

    @Test
    public void testDivide() {
        System.out.println("divide");
        CalculadoraPruebas instance = new CalculadoraPruebas (40,20);
        int expResult = 2;
        int result = instance.divide();
        assertEquals("Falla la división", expResult, result);
    }  
    
     @Test
    public void testPordos() {
        System.out.println("multiplica por dos");
        CalculadoraPruebas instance = new CalculadoraPruebas (30,20);
        int expResult = 60;
        int result = instance.pordos();
        assertEquals("Falla la división", expResult, result);
    }  
    
     @Test
    public void testMassiete() {
        System.out.println("suma siete");
        CalculadoraPruebas instance = new CalculadoraPruebas (30,20);
        int expResult = 37;
        int result = instance.massiete();
        assertEquals("Falla la división", expResult, result);
    }  
    
}
