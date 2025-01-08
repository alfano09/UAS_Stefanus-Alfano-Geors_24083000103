/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.newpackge;

/**
 *
 * @author ASUS
 */
class Bank {
    private double saldo;

    // Konstruktor untuk menginisialisasi saldo
    public Bank(double saldo) {
        this.saldo = saldo;
    }

    // Method untuk menyimpan uang
    public void simpanUang(double jumlah) {
        saldo += jumlah;
        System.out.println("Simpan uang: Rp. " + jumlah);
    }

    // Method untuk mengambil uang
    public void ambilUang(double jumlah) {
        if (jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Ambil uang: Rp. " + jumlah);
        } else {
            System.out.println("Saldo tidak cukup untuk mengambil Rp. " + jumlah);
        }
    }

    // Method untuk mendapatkan saldo saat ini
    public double getSaldo() {
        return saldo;
    }
}

