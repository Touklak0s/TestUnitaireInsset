/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testunitaireinsset.NombreParfait;

import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author insset
 */
@RunWith(Parameterized.class)
public class ParfaitParametersTest {
    
   //Il faut ensuite créer une méthode static annotée @Parameters fournissant les paramètres du test 
    //(entrées, résultat attendu) sous forme de Collection d’objet, où chaque élément de la collection est un objet (généralement un tableau) 
    //contenant les paramètres du test : 
    @Parameters
    public static Collection<Object[]> params() {
        return Arrays.asList(
                new Object[]{3, 6,true},
                new Object[]{6, 3,false},
                new Object[]{10 ,9 ,false}
        );
    }

    //Le runner Parameterized Parameterized va injecter les valeurs fournies par la précédente méthode dans des attributs de classe afin de les rendre 
    //accessibles aux méthodes de test. Par conséquent, il faut ajouter les attributs et le constructeur nécessaires à cette injection : 
    private final int nombre;
    private final int nombre2;
    private final boolean isDivisible;

    public ParfaitParametersTest(final int nombre, final int nombre2, final boolean isDivisible) {
        this.nombre = nombre;
        this.nombre2 = nombre2;
        this.isDivisible = isDivisible;
    }

    /**
     * Test de la méthode estDivisilbePar -> OK
     */
    @Test
    public void testEstDivisibleParOK() {
        //given
        long n = nombre;
        long val = nombre2;
        Parfait instance = new Parfait();
        
        //when
        boolean result = instance.estDivisiblePar(n, val);
        
        //then
        assertEquals(isDivisible, result);
    }
    
}
