package Benda3D;

import Benda.Benda3D;
import Benda2D.Lingkaran;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class Tabung extends Lingkaran implements Benda3D {
    private double tinggiSilinder;
    private double volumeTabung;
    private double luasPermukaanTabung;

    public Tabung(double jariJari, double tinggiSilinder) {
        super(jariJari);
        this.tinggiSilinder = tinggiSilinder;
    }

    @Override
    public void run() {
        System.out.println("Menghitung Tabung");
        this.volumeTabung = hitungVolume();
        this.luasPermukaanTabung = hitungLuasPermukaan();
    }

    @Override
    public double hitungVolume() {
        return 0;
    }

    public double getVolumeSilinder() {
        return 0;
    }

    @Override
    public double hitungLuasPermukaan() {
        return 0;
    }

    public double getLuasPermukaanSilinder() {
        return 0;
    }

}