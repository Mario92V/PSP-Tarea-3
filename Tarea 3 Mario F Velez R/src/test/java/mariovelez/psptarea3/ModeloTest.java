package mariovelez.psptarea3;

import java.util.LinkedList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author admin
 */
public class ModeloTest {
    
    public ModeloTest() {
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

    /**
     * Test of calcularMedia method, of class Modelo.
     */
    @Test
    public void testCalcularMedia()
    {
        System.out.println("calcularMedia");
        LinkedList<String> listaE = new LinkedList<String>();
        listaE.add("130,186");
        listaE.add("650,699");
        listaE.add("99,132");
        listaE.add("150,272");
        listaE.add("128,291");
        listaE.add("302,331");
        listaE.add("95,199");
        listaE.add("945,1890");
        listaE.add("368,788");
        listaE.add("961,1601");
        int tipo = 0;
        Modelo instance = new Modelo();
        double expResult = 382.8;
        double result = instance.calcularMedia(listaE, tipo);
        assertEquals(expResult, result, 0.1);
    }

    /**
     * Test of calcularB0 method, of class Modelo.
     */
    @Test
    public void testCalcularB0()
    {
        System.out.println("calcularB0");
        LinkedList<String> listaE = new LinkedList<String>();
        listaE.add("130,186");
        listaE.add("650,699");
        listaE.add("99,132");
        listaE.add("150,272");
        listaE.add("128,291");
        listaE.add("302,331");
        listaE.add("95,199");
        listaE.add("945,1890");
        listaE.add("368,788");
        listaE.add("961,1601");
        Modelo instance = new Modelo();
        double expResult = -22.55;
        double result = instance.calcularB0(listaE);
        assertEquals(expResult, result, 0.01);
    }

    /**
     * Test of calcularB1 method, of class Modelo.
     */
    @Test
    public void testCalcularB1()
    {
        System.out.println("calcularB1");
        LinkedList<String> listaE = new LinkedList<String>();
        listaE.add("130,186");
        listaE.add("650,699");
        listaE.add("99,132");
        listaE.add("150,272");
        listaE.add("128,291");
        listaE.add("302,331");
        listaE.add("95,199");
        listaE.add("945,1890");
        listaE.add("368,788");
        listaE.add("961,1601");
        Modelo instance = new Modelo();
        double expResult = 1.7279;
        double result = instance.calcularB1(listaE);
        assertEquals(expResult, result, 0.0001);
    }

    /**
     * Test of calcularRxy method, of class Modelo.
     */
    @Test
    public void testCalcularRxy()
    {
        System.out.println("calcularRxy");
        LinkedList<String> listaE = new LinkedList<String>();
        listaE.add("130,186");
        listaE.add("650,699");
        listaE.add("99,132");
        listaE.add("150,272");
        listaE.add("128,291");
        listaE.add("302,331");
        listaE.add("95,199");
        listaE.add("945,1890");
        listaE.add("368,788");
        listaE.add("961,1601");
        Modelo instance = new Modelo();
        double expResult = 0.9545;
        double result = instance.calcularRxy(listaE);
        assertEquals(expResult, result, 0.0001);
    }

    /**
     * Test of calcularR2 method, of class Modelo.
     */
    @Test
    public void testCalcularR2()
    {
        System.out.println("calcularR2");
        LinkedList<String> listaE = new LinkedList<String>();
        listaE.add("130,186");
        listaE.add("650,699");
        listaE.add("99,132");
        listaE.add("150,272");
        listaE.add("128,291");
        listaE.add("302,331");
        listaE.add("95,199");
        listaE.add("945,1890");
        listaE.add("368,788");
        listaE.add("961,1601");
        Modelo instance = new Modelo();
        double expResult = 0.9111;
        double result = instance.calcularR2(listaE);
        assertEquals(expResult, result, 0.0001);
    }

    /**
     * Test of calcularYk method, of class Modelo.
     */
    @Test
    public void testCalcularYk() {
        System.out.println("calcularYk");
        double b0 = -22.55;
        double b1 = 1.7279;
        double xK = 386;
        Modelo instance = new Modelo();
        double expResult = 644.429;
        double result = instance.calcularYk(b0, b1, xK);
        assertEquals(expResult, result, 0.01);
    }
    
}