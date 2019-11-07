/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118074.latihan48.kalkulator;

/**
 *
 * @author ASUS
 * NAMA : fikri maulana
 * KELAS : if2
 * NIM : 10118074
 */
public class PBO210118074LATIHAN48Kalkulator {
    
    private static double val1,val2;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Kalkulator calc = new Kalkulator();
        calc.setValue1(7);
        calc.setValue2(5);
        
        val1 = calc.getValue1();
        val2 = calc.getValue2();
        
        System.out.println("VALUE 1 = " + val1);
        System.out.println("VALUE 2 = " + val2);
        
        calc.setNameProject();
        calc.setNoteProject("This project shown you how to manage method in java");
        
        System.out.println("Result Add is = " + calc.add(val1, val2));
        System.out.println("Result Minus is = " + calc.minus(val1, val2));
        System.out.println("Result Multiple is = " + calc.multiplication(val1, val2));
        System.out.println("Result Division is = " + calc.division(val1, val2));
        
        System.out.println("developed by : fikri maulana ");
    }
    
}
    

