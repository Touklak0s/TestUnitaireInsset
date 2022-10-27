/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testunitaireinsset.NombreParfait;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author insset
 */
public class ParfaitTest {
    
    public ParfaitTest() {
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
     * Test de la méthode estDivisilbePar -> OK
     */
    @Test
    public void testEstDivisibleParOK() {
        //given
        long n = 3;
        long val = 6;
        Parfait instance = new Parfait();
        
        //when
        boolean expResult = true;
        boolean result = instance.estDivisiblePar(n, val);
        
        //then
        assertTrue("OK", result);
    }
    
     /**
     * Test de la méthode estDivisilbePar -> NOK
     */
    @Test
    public void testEstDivisibleParNOK() {
        //given
        long n = 6;
        long val = 3;
        Parfait instance = new Parfait();
        
        //when
        boolean expResult = true;
        boolean result = instance.estDivisiblePar(n, val);
        
        //then
        assertFalse("NOK", result);
    }

    /**
     * Test de la méthode Diviseurs
     */
    @Test
    public void testDiviseursOK() {
        long val = 4;
        Parfait instance = new Parfait();
        long[] expResult = {1, 4, 2};
        long[] result = instance.diviseurs(val);
        Assert.assertArrayEquals(expResult, result);
    }
    
        /**
     * Test de la méthode Diviseurs
     */
    @Test
    public void testDiviseursSUPCinq() {
        long val = 6;
        Parfait instance = new Parfait();
        long[] expResult = {1, 6, 2, 3};
        long[] result = instance.diviseurs(val);
        Assert.assertArrayEquals(expResult, result);
    }

    /**
     * Test of estParfait method, of class Parfait.
     */
    @Test
    public void testEstParfaitOK() {
        long val = 6;
        Parfait instance = new Parfait();
        boolean expResult = true;
        boolean result = instance.estParfait(val);
        assertTrue("OK", result);
    }
    
    /**
     * Test of estParfait method, of class Parfait.
     */
    @Test
    public void testEstParfaitNOK() {
        long val = 5;
        Parfait instance = new Parfait();
        boolean expResult = false;
        boolean result = instance.estParfait(val);
        assertFalse("NOK", result);
    }

    /**
     * Test of formaterResult method, of class Parfait.
     */
    @Test
    public void testFormaterResultOK() {
        boolean isParfait = true;
        long nb = 6;
        Parfait instance = new Parfait();
        String expResult = "le nombre " + nb + " est parfait";
        String result = instance.formaterResult(isParfait, nb);
        assertEquals(expResult, result);
    }
    
        /**
     * Test of formaterResult method, of class Parfait.
     */
    @Test
    public void testFormaterResultNOK() {
        boolean isParfait = false;
        long nb = 5;
        Parfait instance = new Parfait();
        String expResult = "le nombre " + nb + " n'est pas parfait";
        String result = instance.formaterResult(isParfait, nb);
        assertEquals(expResult, result);
    }
    
}
