/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan1;

/**
 *
 * @author hp
 */
public class Utama {
    
    public static void main(String[] args){
        
        Lingkaran lingkaran = new Lingkaran();
        System.out.println("Luas lingkaran : " + lingkaran.luas(10));
        System.out.println("Keliling lingkaran : " + lingkaran.keliling(10));
        
        Segitiga segitiga = new Segitiga();
        System.out.println("Luas segitiga : " + segitiga.luas(10,10));
        System.out.println("Keliling segitiga : " + segitiga.keliling(10,10,10));
        
        Persegi persegi = new Persegi();
        System.out.println("Luas persegi : " + persegi.luas(10,10));
        System.out.println("Keliling persegi : " + persegi.keliling(10,10,10,10));
        
    }
    
}
