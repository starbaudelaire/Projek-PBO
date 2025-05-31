package Benda2D;

import Benda.BendaGeometri;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class Persegi implements BendaGeometri {

    public double sisi;
    private double luasPersegi;
    private double kelilingPersegi;

    public Persegi(double sisi) {
        this.sisi = sisi;

        try{
            if(sisi <= 0){
                throw new ArithmeticException();
            }
        }catch(ArithmeticException e){
            System.out.println("Error : " + e.getLocalizedMessage());
        }

        luasPersegi = hitungLuas();
        kelilingPersegi = hitungKeliling();
    }

    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }

    public double getLuasPersegi() {
        return luasPersegi;
    }

    @Override
    public double hitungKeliling() {
        return 4 * sisi;
    }

    public double getKelilingPersegi() {
        return kelilingPersegi;
    }

}