/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculateaverage;

/**
 *
 * @author moomalharoon
 */
public class CalculateAverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           double ave = calculateAverage(1,2,3);
    }
   
    public static double calculateAverage (int num1, int num2, int num3){
        return (num1 + num2 + num3) / 3.0;

    }
   
}


    
    

