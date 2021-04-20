/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculateaverage;

import static junit.framework.TestCase.assertEquals;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author moomalharoon
 */
public class CalculateAverageIT {

    private Object calAve;
    
    public CalculateAverageIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class CalculateAverage.
     */
    public void Test1(){
        double val = calAve.calculateAverage(1,2,3);
        double result = 2.0;
        assertEquals(val, result);
    }
   
    public void Test2(){
        double val = calAve.calculateAverage(0,-2,3);
        double result = 0.33;
        assertEquals(val, result);
    }
   
    public void Test3(){
        double val = calAve.calculateAverage(-1,-2,-2);
        double result = -1.67;
        assertEquals(val, result);
    }
}