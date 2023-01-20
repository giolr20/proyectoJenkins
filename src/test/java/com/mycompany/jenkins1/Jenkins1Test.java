/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.jenkins1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author puk
 */
public class Jenkins1Test {
    
    /**
     * Test of dia_laboral method, of class MiClase.
     */
    @org.junit.jupiter.api.Test
    public void testDia_laboral() {
        System.out.println("dia_laboral");
        String dia = "Lunes";
        boolean expResult = true;
        boolean result = Jenkins1.dia_laboral(dia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @org.junit.jupiter.api.Test
    public void testDia_laboral2() {
        System.out.println("dia_laboral");
        String dia = "Martes";
        boolean expResult = true;
        boolean result = Jenkins1.dia_laboral(dia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     @org.junit.jupiter.api.Test
        public void testDia_laboral3() {
        System.out.println("dia_laboral");
        String dia = "Miercoles";
        boolean expResult = true;
        boolean result = Jenkins1.dia_laboral(dia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
        
    @org.junit.jupiter.api.Test
    public void testDia_laboral4() {
        System.out.println("dia_laboral");
        String dia = "Jueves";
        boolean expResult = true;
        boolean result = Jenkins1.dia_laboral(dia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     @org.junit.jupiter.api.Test
        public void testDia_laboral5() {
        System.out.println("dia_laboral");
        String dia = "Viernes";
        boolean expResult = true;
        boolean result = Jenkins1.dia_laboral(dia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @org.junit.jupiter.api.Test
    public void testDia_laboral6() {
        System.out.println("dia_laboral");
        String dia = "Sábado";
        boolean expResult = false;
        boolean result = Jenkins1.dia_laboral(dia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     @org.junit.jupiter.api.Test
        public void testDia_laboral7() {
        System.out.println("dia_laboral");
        String dia = "Domingo";
        boolean expResult = false;
        boolean result = Jenkins1.dia_laboral(dia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        
    }
        
        @org.junit.jupiter.api.Test
        public void testDia_laboral8() {
        System.out.println("dia_laboral");
        String dia = "Hola";
        boolean expResult = false;
        boolean result = Jenkins1.dia_laboral(dia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        
    }

}
