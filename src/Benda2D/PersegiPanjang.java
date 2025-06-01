package Benda2D;

import Benda.BendaGeometri;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class PersegiPanjang implements BendaGeometri, Runnable{

    public double panjang;
    public double lebar;
    private double luasPersegiPanjang;
    private double kelilingPersegiPanjang;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public void run() {
        System.out.println("Menghitung Persegi Panjang");
        this.luasPersegiPanjang = hitungLuas();
        this.kelilingPersegiPanjang = hitungKeliling();
    }

    @Override
    public double hitungLuas() {
        return lebar * panjang;
    }

    public double getLuasPersegiPanjang() {
        return luasPersegiPanjang;
    }

    @Override
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    public double getKelilingPersegiPanjang() {
        return kelilingPersegiPanjang;
    }

}