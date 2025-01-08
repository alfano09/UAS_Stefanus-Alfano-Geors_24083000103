/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance.Matematika;

/**
 *
 * @author ASUS
 */
public class MatematikaCanggihBeraksi {
    public static void main(String[] args) {
        
        MatematikaCanggih matCanggih = new MatematikaCanggih();

    
        int a = 20;
        int b = 10;

    
        int hasilPertambahan = matCanggih.pertambahan(a, b);
        System.out.println("Pertambahan: " + a + " + " + b + " = " + hasilPertambahan);

     
        int hasilPerkalian = matCanggih.perkalian(a, b);
        System.out.println("Perkalian: " + a + " * " + b + " = " + hasilPerkalian);

        
        int hasilModulus = matCanggih.modulus(a, b);
        System.out.println("Modulus: " + a + " % " + b + " = " + hasilModulus);
    }
}
