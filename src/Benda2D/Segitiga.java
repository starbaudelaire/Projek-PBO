package Benda2D;

import Benda.BendaGeometri;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class Segitiga implements BendaGeometri, Runnable{

    public double sisi;
    public double tinggi;
    private double luasSegitiga;
    private double kelilingSegitiga;

    public Segitiga(double sisi, double tinggi) {
        this.sisi = sisi;
        this.tinggi = tinggi;
    }

    @Override
    public void run() {
        System.out.println("Menghitung Segitiga");
        this.luasSegitiga = hitungLuas();
        this.kelilingSegitiga = hitungKeliling();
    }

    @Override
    public double hitungLuas() {
        return 0.5 * sisi * tinggi;
    }

    public double getLuasSegitiga() {
        return luasSegitiga;
    }

    @Override
    public double hitungKeliling() {
        return 3 * sisi;
    }

    public double getKelilingSegitiga() {
        return kelilingSegitiga;
    }

}