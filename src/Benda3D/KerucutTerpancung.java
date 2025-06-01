package Benda3D;

import Benda.Benda3D;
import Benda2D.Lingkaran;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class KerucutTerpancung extends Lingkaran implements Benda3D, Runnable {
    private double jariJariAtas;
    private double jariJari;
    private double tinggi;
    private double volumeKerucutTerpancung;
    private double luasPermukaanKerucutTerpancung;

    public KerucutTerpancung(double tinggi, double jariJariAtas, double jariJari) {
        super(jariJari);
    }

    @Override
    public void run() {
        System.out.println("Menghitung Bola");
        this.volumeKerucutTerpancung = hitungVolume();
        this.luasPermukaanKerucutTerpancung = hitungLuasPermukaan();
    }

    @Override
    public double hitungVolume() {
        return 0;
    }

    @Override
    public double hitungLuasPermukaan() {
        return 0;
    }

    public double getLuasPermukaanKerucutTerpancung() {
        return 0;
    }

    public double getVolumeKerucutTerpancung() {
        return 0;
    }

}