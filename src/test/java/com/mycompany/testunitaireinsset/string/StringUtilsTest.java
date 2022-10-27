/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testunitaireinsset.string;

import java.util.Map;
import java.util.TreeMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 *
 * @author insset
 */
public class StringUtilsTest {
    
    public StringUtilsTest() {
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
     * Test of isChaineValide method, of class StringUtils.
     */
    @Test
    public void testIsChaineValideOK() {
        String str = "kayak";
        StringUtils instance = new StringUtils();
        boolean expResult = true;
        boolean result = instance.isChaineValide(str);
        assertEquals(expResult, result);
    }
    
        /**
     * Test of isChaineValide method, of class StringUtils.
     */
    @Rule
	public ExpectedException thrown = ExpectedException.none();
    
    @Test
    public void testIsChaineValideNOK() {
        thrown.expect(IllegalArgumentException.class);
	thrown.expectMessage("Il faut au moins deux caractere en entrée");
        String str = "k";
        StringUtils instance = new StringUtils();
        boolean expResult = false;
        boolean result = instance.isChaineValide(str);
//        assertEquals(expResult, result);
    }

    /**
     * Test of inverse method, of class StringUtils.
     */
    @Test
    public void testInverseOK() {
        String str = "aeiou";
        StringUtils instance = new StringUtils();
        String expResult = "uoiea";
        String result = instance.inverse(str);
        assertEquals(expResult, result);
    }
    


    /**
     * Test of isPalindrome method, of class StringUtils.
     */
    @Test
    public void testIsPalindromeOK() {
        String str = "kayak";
        StringUtils instance = new StringUtils();
        boolean expResult = true;
        boolean result = instance.isPalindrome(str);
        assertEquals(expResult, result);
    }
    
    
    /**
     * Test of isPalindrome method, of class StringUtils.
     */
    @Test
    public void testIsPalindromeNOK() {
        String str = "voiture";
        StringUtils instance = new StringUtils();
        boolean expResult = false;
        boolean result = instance.isPalindrome(str);
        assertEquals(expResult, result);
    }

    /**
     * Test of compterOccurences method, of class StringUtils.
     */
    @Test
    public void testCompterOccurences() {
        String str = "Kayak";
        StringUtils instance = new StringUtils();
        Map<String, Integer> expResult = new TreeMap<>();
        expResult.put("K",1);
        expResult.put("a",2);
        expResult.put("k",1);
        expResult.put("y",1);

        Map<String, Integer> result = instance.compterOccurences(str);
        assertEquals(expResult, result);
    }
    
}
