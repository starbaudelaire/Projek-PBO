package Benda2D;

import Benda.BendaGeometri;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class Persegi implements BendaGeometri, Runnable{

    public double sisi;
    private double luasPersegi;
    private double kelilingPersegi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public void run() {
        System.out.println("Menghitung Persegi");
        this.luasPersegi = hitungLuas();
        this.kelilingPersegi = hitungKeliling();
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