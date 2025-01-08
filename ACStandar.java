/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class ACStandar implements AC {
    @Override
    public void matikanAC() {
        System.out.println("AC dimatikan");
    }

    @Override
    public void hidupkanAC() {
        System.out.println("AC dihidupkan");
    }

    @Override
    public void dinginkanAC() {
        System.out.println("Suhu AC diturunkan");
    }

    @Override
    public void panaskanAC() {
        System.out.println("Suhu AC dinaikkan");
    }
}
