/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packer;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author 90051500
 */
public class BoxTest {
    
    public BoxTest() {
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
     * Test of addProduct method, of class Box.
     * Test Case:101
     */
    @Test
    public void testAddProduct_Product() {
        System.out.println("addProduct");
        Product product = new Product("Nails",15,true,true);
        Box instance = null;
        System.out.println( product + "Added");

        //instance.addProduct(product);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addProduct method, of class Box.
     */
    @Test
    public void testAddProduct_Product_int() {
        System.out.println("addProduct");
        Product product = null;
        int quantity = 0;
        Box instance = null;
        instance.addProduct(product, quantity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLabel method, of class Box.
     */
    @Test
    public void testGetLabel() {
        System.out.println("getLabel");
        Box instance = null;
        String expResult = "";
        String result = instance.getLabel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Box.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Box instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWeight method, of class Box.
     */
    @Test
    public void testGetWeight() {
        System.out.println("getWeight");
        Box instance = null;
        double expResult = 0.0;
        double result = instance.getWeight();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canFit method, of class Box.
     */
    @Test
    public void testCanFit_Product() {
        System.out.println("canFit");
        Product p = null;
        Box instance = null;
        boolean expResult = false;
        boolean result = instance.canFit(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canFit method, of class Box.
     */
    @Test
    public void testCanFit_Product_int() {
        System.out.println("canFit");
        Product p = null;
        int quantity = 0;
        Box instance = null;
        boolean expResult = false;
        boolean result = instance.canFit(p, quantity);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remainingCapacity method, of class Box.
     */
    @Test
    public void testRemainingCapacity() {
        System.out.println("remainingCapacity");
        Box instance = null;
        double expResult = 0.0;
        double result = instance.remainingCapacity();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isFragile method, of class Box.
     */
    @Test
    public void testIsFragile() {
        System.out.println("isFragile");
        Product product = new Product("Light Bulbs",15,false,true);
        //Box instance = null;
        boolean expResult = true;
        boolean result = product.isFragile();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isHazardous method, of class Box.
     */
    @Test
    public void testIsHazardous() {
        System.out.println("isHazardous");
        Product product = new Product("Ladder",15,false,false);
        //Box instance = null;
        boolean expResult = false;
        boolean result = product.isHazardous();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isHeavy method, of class Box.
     */
    @Test
    public void testIsHeavy() {
        System.out.println("isHeavy");
        Box instance = null;
        boolean expResult = false;
        boolean result = instance.isHeavy();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
