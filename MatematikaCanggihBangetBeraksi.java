/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematikalook;

/**
 *
 * @author ASUS
 */
public class MatematikaCanggihBangetBeraksi {
    public static void main(String[] args) {
        
        MatematikaCanggihBanget matCanggihBanget = new MatematikaCanggihBanget();

        
        int a = 20;
        int b = 10;
        int c = 5;

       
        int hasilPertambahan = matCanggihBanget.pertambahan(a, b);
        System.out.println("Pertambahan: " + a + " + " + b + " = " + hasilPertambahan);

       
        int hasilPerkalian = matCanggihBanget.perkalian(a, b);
        System.out.println("Perkalian: " + a + " * " + b + " = " + hasilPerkalian);

        
        int hasilModulus = matCanggihBanget.modulus(a, b);
        System.out.println("Modulus: " + a + " % " + b + " = " + hasilModulus);

        
        int hasilPertambahanTiga = matCanggihBanget.pertambahanTiga(a, b, c);
        System.out.println("Pertambahan Tiga: " + a + " + " + b + " + " + c + " = " + hasilPertambahanTiga);
    }
}
