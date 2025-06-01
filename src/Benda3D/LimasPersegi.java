package Benda3D;

import Benda.Benda3D;
import Benda2D.Persegi;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class LimasPersegi extends Persegi implements Benda3D, Runnable {
    private double tinggiLimasPersegi;
    private double volumeLimasPersegi;
    private double luasPermukaanLimasPersegi;

    public LimasPersegi(double sisi, double tinggiLimasPersegi) {
        super(sisi);
        this.tinggiLimasPersegi = tinggiLimasPersegi;
    }

    @Override
    public void run() {
        System.out.println("Menghitung Limas Persegi");
        this.volumeLimasPersegi = hitungVolume();
        this.luasPermukaanLimasPersegi = hitungLuasPermukaan();
    }

    @Override
    public double hitungVolume() {
        return (double)1/3 * tinggiLimasPersegi * getLuasPersegi();
    }

    public double getVolumeLimasPersegi() {
        return volumeLimasPersegi;
    }

    @Override
    public double hitungLuasPermukaan() {
        return getLuasPersegi() + getKelilingPersegi() * ((double)1/2 * tinggiLimasPersegi);
    }

    public double getLuasPermukaanLimasPersegi() {
        return luasPermukaanLimasPersegi;
    }

}