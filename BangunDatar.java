/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan1;

/**
 *
 * @author hp
 */
public class BangunDatar {
    
    public float luas (int p, int l){
        return (float) (p*l);          
    }
    
    public float keliling (int p, int l){
        return (float) (2*p+l);          
    }
}

public class Lingkaran extends BangunDatar{
    
    private int r;
    private final double phi = 3.14;
    
    public float luas (int r){
        return (float) (this.phi*r*r);          
    }
    
    public float keliling (int d){
        return (float) (this.phi*d);          
    }
    
}

public class Segitiga extends BangunDatar {
    
    private int alas;
    private int tinggi;
    
    public float luas (int a, int t){
        return (float) (0.5*a*t);          
    }
    
    public float keliling (int s1, int s2, int s3){
        return (float) (s1 + s2 + s3);          
    }
    
}

public class Persegi {
    
    private int sisi;
    
    public float luas (int s1, int s2){
        return (float) (s1*s2);          
    }
    
    public float keliling (int s1, int s2, int s3, int s4){
        return (float) (s1+s2+s3+s4);          
    }
    
}